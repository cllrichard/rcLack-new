package com.example.rclack.spring.day1113;

import com.example.rclack.spring.day1113.one.Red;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryPorcessorApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com/example/rclack/spring/day1113/one");
        Red red = ctx.getBean(Red.class);
        System.out.println(red);
    }
}
