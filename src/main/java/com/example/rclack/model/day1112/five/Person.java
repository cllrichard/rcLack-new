package com.example.rclack.model.day1112.five;

public class Person implements IPerson{
    @Override
    public void eat() {
        System.out.println("我在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("我在睡觉");
    }
}