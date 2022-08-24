package com.example.rclack.spring.day1113.two;

import org.springframework.stereotype.Component;

public class Cat extends Animal {
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
