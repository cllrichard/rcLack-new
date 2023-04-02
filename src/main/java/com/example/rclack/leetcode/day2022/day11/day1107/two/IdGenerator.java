package com.example.rclack.leetcode.day2022.day11.day1107.two;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;

    private static final ConcurrentHashMap<Long, IdGenerator> instances = new ConcurrentHashMap<>();



}
