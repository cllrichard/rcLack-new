package com.example.rclack.spring.day1110.bean;

public class Bartender {

    String name;

    public Bartender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bartender{" +
                "name='" + name + '\'' +
                '}';
    }
}
