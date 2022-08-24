package com.example.rclack.spring2.day0210s;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAspectApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("day0210/xmlaspect.xml");
        FinanceService financeService = ctx.getBean(FinanceService.class);
        financeService.addMoney(12.3);
        financeService.subtractMoney(543.21);
        System.out.println(financeService.getMoneyById("abc"));
    }
}
