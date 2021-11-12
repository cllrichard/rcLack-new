package com.example.rclack.spring.day1110.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("city")
public class BartenderConfiguration {

    @Bean
    public Bartender name() {
        return new Bartender("张三");
    }
}
