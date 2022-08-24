package com.example.rclack.spring2.day0210.day0211;

public class Logger {

    public void beforePrint() {
        System.out.println("Logger beforePrint run .... ");
    }


    public void afterPrint() {
        System.out.println("Logger afterPrint run....");
    }

    public void afterReturningPrint() {
        System.out.println("Logger afterRetruningPrint run .....");
    }

    public void afterThrowingPrint() {
        System.out.println("Logger afterThrowingPrint run ....");
    }
}
