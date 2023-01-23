package ru.netology.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;
import ru.netology.conditional.config.JavaConfig;

public class DevProfile implements SystemProfile{

    @Override
    public String getProfile() {
        return "Current profile is dev\n";
    }
}
