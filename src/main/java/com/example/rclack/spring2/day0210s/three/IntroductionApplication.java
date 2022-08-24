package com.example.rclack.spring2.day0210s.three;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IntroductionApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(IntroductionConfiguration.class);
        FinanceService financeService = ctx.getBean(FinanceService.class);
        financeService.transfer(1L, 2L, 100);
        System.out.println("`~~~~~~~~");
        financeService.transfer(1L, 2L, -1);
    }
}
