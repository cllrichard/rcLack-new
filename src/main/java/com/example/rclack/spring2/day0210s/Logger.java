package com.example.rclack.spring2.day0210s;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.Aware;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class Logger {

    @Before("execution(public * com..FinanceService.*(..))")
    public void beforePrint(JoinPoint joinPoint) {
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println("Logger beforePrint run .... ");
    }


    @After("execution(* com.example.rclack.spring2.day0210s.*.*(String))")
    public void afterPrint() {
        System.out.println("Logger afterPrint run....");
    }

    @AfterReturning("execution(* com.example.rclack.spring2.day0210s.*.*(String))")
    public void afterReturningPrint() {
        System.out.println("Logger afterRetruningPrint run .....");
    }

    @AfterThrowing("execution(* com.example.rclack.spring2.day0210s.*.*(String))")
    public void afterThrowingPrint() {
        System.out.println("Logger afterThrowingPrint run ....");
    }
}
