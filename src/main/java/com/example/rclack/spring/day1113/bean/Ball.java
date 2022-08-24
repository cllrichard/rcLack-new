package com.example.rclack.spring.day1113.bean;

public class Ball {

    private String id;

    @Override
    public String toString() {
        return "Ball{" +
                "id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
