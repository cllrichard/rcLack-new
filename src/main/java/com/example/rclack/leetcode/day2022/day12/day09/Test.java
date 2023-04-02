package com.example.rclack.leetcode.day2022.day12.day09;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {


    public static void main(String[] args) {
        Executors executors = (Executors) Executors.newFixedThreadPool(12);
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(1, 2, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));
        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
//        ClassLoader loader = Thread.c
    }
}
