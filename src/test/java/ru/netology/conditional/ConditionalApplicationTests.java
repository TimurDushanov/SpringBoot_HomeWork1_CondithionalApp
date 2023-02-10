package ru.netology.conditional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.testcontainers.containers.GenericContainer;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ConditionalApplicationTests {
    @Autowired
    private TestRestTemplate restTemplate;

    private static final GenericContainer<?> myDevApp = new GenericContainer<>("devapp")
            .withExposedPorts(8080);

    private static final GenericContainer<?> myProdApp = new GenericContainer<>("prodapp")
            .withExposedPorts(8081);

    @BeforeAll
    public static void setUp(){
        myDevApp.start();
        myProdApp.start();

    }

    @Test
    void contextLoads() {
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:" +
                myDevApp.getMappedPort(8080), String.class);
        System.out.println(entity.getBody());

    }

}
