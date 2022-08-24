package com.example.rclack.spring.day1113;

import com.example.rclack.spring.day1113.two.Cat;
import com.example.rclack.spring.day1113.two.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RegistryPostProcessorApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com/example/rclack/spring/day1113/two");

        Cat cat = ctx.getBean(Cat.class);

        System.out.println(cat);

        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);
    }


}
