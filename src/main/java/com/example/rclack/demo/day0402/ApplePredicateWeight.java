package com.example.rclack.demo.day0402;

public class ApplePredicateWeight implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }

}
