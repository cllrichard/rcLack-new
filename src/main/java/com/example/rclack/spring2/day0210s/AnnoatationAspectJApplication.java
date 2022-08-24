package com.example.rclack.spring2.day0210s;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoatationAspectJApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AspectJAOPConfiguration.class);

        FinanceService financeService = ctx.getBean(FinanceService.class);

        financeService.addMoney(123.45);

        financeService.subtractMoney(543.21);

        financeService.getMoneyById("abc");
    }



}
