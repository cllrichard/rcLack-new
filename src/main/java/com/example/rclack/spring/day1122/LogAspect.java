package com.example.rclack.spring.day1122;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    @Before("execution(public * com.example.rclack.spring.day1122.bean.UserService.*(..))")
    public void beforePrint() {
        System.out.println("LogAspect beforePrint.....");
    }


}
