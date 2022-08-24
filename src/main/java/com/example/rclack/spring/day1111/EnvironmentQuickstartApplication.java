package com.example.rclack.spring.day1111;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnvironmentQuickstartApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com/example/rclack/spring/day1111");

        EnvironmentHolder environmentHolder = ctx.getBean(EnvironmentHolder.class);
        environmentHolder.printEnvironment();
    }
}
