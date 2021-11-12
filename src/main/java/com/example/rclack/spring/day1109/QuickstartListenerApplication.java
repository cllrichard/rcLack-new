package com.example.rclack.spring.day1109;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QuickstartListenerApplication {

    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器。。。");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.example.rclack.spring.day1109.bean");
        System.out.println("IOC容器初始化完成");
        ctx.close();
        System.out.println("IOC容器关闭");
    }
}
