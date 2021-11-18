package com.example.rclack.spring.day1113.one;

import org.springframework.stereotype.Component;

@Component
public class Green extends Color{
    @Override
    public String toString() {
        return "Green{" +
                "name='" + name + '\'' +
                '}';
    }
}
