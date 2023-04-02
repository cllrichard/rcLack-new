package com.example.rclack.demo.day0402;

public class AppleGreenColorPredicate implements ApplePredicate {
    private String GREEN = "green";

    @Override
    public boolean test(Apple apple) {
        return GREEN.equals(apple.getColor());
    }

}
