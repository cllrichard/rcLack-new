package com.example.rclack.leetcode.day2022.day11.day1107;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {

    private AtomicLong id = new AtomicLong(0);

    private IdGenerator(){}

    private static class SingletonHolder{
        private static final IdGenerator instance = new IdGenerator();
    }

    public static IdGenerator getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}






















