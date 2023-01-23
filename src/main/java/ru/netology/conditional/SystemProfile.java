package ru.netology.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
import ru.netology.conditional.config.JavaConfig;

@ConditionalOnBean(JavaConfig.class)
@Component
public interface SystemProfile {
    String getProfile();
}
