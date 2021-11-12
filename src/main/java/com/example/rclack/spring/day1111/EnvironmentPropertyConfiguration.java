package com.example.rclack.spring.day1111;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.rclack.spring.day1111")
@PropertySource("day1111/jdbc.properties")
public class EnvironmentPropertyConfiguration {
}
