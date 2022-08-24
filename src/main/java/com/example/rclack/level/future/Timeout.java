package com.example.rclack.level.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Timeout {

    private static final Ad DEFAULT_AD = new Ad("无网络默认广告");

    private static final ExecutorService exec = Executors.newFixedThreadPool(10);


    public static void main(String[] args) {
    }

    static class Ad{
        String name;

        public Ad(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Ad{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


    static class FetchAdTask implements Callable<Ad> {


        @Override
        public Ad call() throws Exception {
            return null;
        }
    }



}
