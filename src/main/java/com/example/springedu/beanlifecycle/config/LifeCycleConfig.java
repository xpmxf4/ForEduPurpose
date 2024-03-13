package com.example.springedu.beanlifecycle.config;

import com.example.springedu.beanlifecycle.ConfigWay;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfig {

    @Bean(initMethod = "initialize", destroyMethod = "close")
    public ConfigWay configWay() {
        return new ConfigWay();
    }
}
