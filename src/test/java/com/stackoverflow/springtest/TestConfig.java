package com.stackoverflow.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public AutowiredBean autowiredBean() {
        return new AutowiredBean();
    }
}
