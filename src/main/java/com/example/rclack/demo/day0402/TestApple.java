package com.example.rclack.demo.day0402;

import org.apache.commons.compress.utils.Lists;

import java.util.ArrayList;
import java.util.List;

public class TestApple {


    public static void main(String[] args) {
        List<Apple> list = Lists.newArrayList();
        Apple apple = new Apple();
        apple.setColor("green");
        list.add(apple);
        Apple apple1 = new Apple();
        apple1.setColor("greens");
        list.add(apple1);
        ApplePredicate applePredicate = new AppleGreenColorPredicate();
        List<Apple> list1 = filterApples(list, applePredicate);
        System.out.println();
    }




    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
