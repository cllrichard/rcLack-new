package com.example.rclack.leetcode.day2022.day08.day0822;

import java.util.concurrent.Callable;

public class Product {

    private int count = 0;

    public synchronized void produce() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Join this thread");

        // 如果产品数量大于 0 ， 则不需要添加产品
        if (count > 0) {
            System.out.println(Thread.currentThread().getName() + " : product mount more than one, join wait");
            this.wait();
        }
        count ++;
        System.out.println();

        System.out.println();

        this.notifyAll();
    }

    //消费
    public synchronized void consume() throws InterruptedException {
        System.out.println("");
        if (count <= 0) {
            System.out.println("");
            this.wait();
        }
        count --;
        System.out.println();
        System.out.println();
        this.notifyAll();
    }


    public static void main(String[] args) {
        Product product = new Product();
//        Callable
//        Runnable pro = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }
    }
}
