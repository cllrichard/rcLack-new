package com.example.rclack.spring.day1113;

import com.example.rclack.spring.day1113.bean.Ball;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantiationAwareApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("day1113/ball.xml");
        Ball ball = (Ball) ctx.getBean("ball");
        System.out.println(ball);

        Ball ball2 = (Ball) ctx.getBean("ball2");
        System.out.println(ball2);
    }

}
