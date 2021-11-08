package com.example.rclack.level.future;

import java.util.concurrent.*;

public class GetException {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        Future<Integer> submit = executorService.submit(new CallableTask());
        try {
            submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    static class CallableTask implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            throw new IllegalArgumentException("callable抛出异常");
        }
    }


}
