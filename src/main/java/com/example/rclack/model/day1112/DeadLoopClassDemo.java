package com.example.rclack.model.day1112;

public class DeadLoopClassDemo {

    static class DeadLoopClass{
        static {
            if (true) {
                System.out.println(Thread.currentThread().getName() + " init DeadLoopClass");
                while (true) {

                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable script = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start");
                DeadLoopClass dlc = new DeadLoopClass();
                System.out.println(Thread.currentThread().getName() + " run over");
            }
        };
        Thread t1 = new Thread(script);
        Thread t2 = new Thread(script);
        t1.start();
        t2.start();
    }
}
