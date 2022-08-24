package com.example.rclack.spring2.day0210s.two;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TransactionAspectConfiguration.class);
        FinanceService financeService = ctx.getBean(FinanceService.class);
    }
}
