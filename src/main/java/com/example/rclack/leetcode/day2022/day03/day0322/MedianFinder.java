package com.example.rclack.leetcode.day2022.day03.day0322;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MedianFinder {
    double mid;
    int size;
    List<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();
        mid = 0D;
        size = 0;
    }

    public void addNum(int num) {
        list.add(num);
        size++;
        list = list.stream().sorted().collect(Collectors.toList());
        if(size >= 2) {
            if(size % 2 == 0) { //偶数
                // 4 / 2 = 2 - > (2,2-1)
                int idx = size / 2;
                mid = (list.get(idx) + list.get(idx - 1)) / 2.0;
            }else {
                int idx = size / 2;
                mid = list.get(idx);
            }
        }else {
            mid = list.get(size - 1);
        }
    }

    public double findMedian() {
        return mid;
    }
}
