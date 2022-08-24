package com.example.rclack.spring2.day0418.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() { //不指定bean name 默认 方法名称
        return "Hello,World ";
    }

}
