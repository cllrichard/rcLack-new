package com.example.rclack.level.future;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

//run 方法中无法抛出checked Exception
public class RunnableCantThrowsException {

    Runnable runnable = () -> {
    };

}
