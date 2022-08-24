package com.example.rclack.model.day1112;

public class Employee {

    private String position;

    private String job;

    public Employee(String position, String job) {
        this.position = position;
        this.job = job;
    }

    public void work() {
        System.out.println("我是" + position + ", 我正在" + job);
    }
}
