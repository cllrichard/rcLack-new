package com.example.rclack.spring.day1113.three.bean;

import lombok.Data;
import lombok.NonNull;
@Data
public class Person {

    private String name;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
