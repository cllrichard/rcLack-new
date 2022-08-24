package com.example.rclack.model.day1113;

public class GCDemo {

    public static void main(String[] args) {
        {
            byte[] place = new byte[64 * 1024 * 1024];
        }
        System.gc();
    }


}
