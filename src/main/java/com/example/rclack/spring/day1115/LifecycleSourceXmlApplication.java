package com.example.rclack.spring.day1115;

import com.example.rclack.spring.day1115.bean.Cat;
import com.example.rclack.spring.day1115.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Period;

public class LifecycleSourceXmlApplication {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        ctx.setConfigLocation("day1115/personAndCat.xml");
        System.out.println("===============准备刷新IOC容器=============");
        ctx.refresh();

        System.out.println("================IOC容器刷新完毕==================");

        ctx.start();

        System.out.println("================IOC容器启动完成==================");

        Person person = ctx.getBean(Person.class);
        System.out.println(person);
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        System.out.println("================准备停止IOC容器==================");

        ctx.stop();

        System.out.println("================IOC容器停止成功==================");

        ctx.close();

    }
}
