package com.example.rclack.level.current;

import java.util.concurrent.ConcurrentHashMap;

public class OptionsNotSafe implements Runnable {

    private static ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        scores.put("key", 0);
        Thread thread = new Thread(new OptionsNotSafe());
        Thread thread1 = new Thread(new OptionsNotSafe());
        Thread thread2 = new Thread(new OptionsNotSafe());
        thread.start();
        thread1.start();
        thread2.start();
        thread.join();
        thread1.join();
        thread2.join();
        System.out.println(scores);
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            while (true) {
                Integer score = scores.get("key");
                int newScores = score + 1;
                boolean b = scores.replace("key", score, newScores);
                if (b) {
                    break;
                }
            }
        }
    }
}
