package com.example.rclack.spring2.day0210s.three;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class IntroductionAspect {

    @Before("execution(* com..day0210s.three.FinanceService.transfer(Long,Long,int))")
    public void beforePrintLog(JoinPoint joinPoint) {
        int money = (int)joinPoint.getArgs()[2];
        MoneyValidator validator = (MoneyValidator) joinPoint.getThis();
        if (validator.validate(money)) {
            System.out.println("转账动作前置打印.....");
        } else {
            throw new IllegalArgumentException("转账金额不合法! ");
        }

//        System.out.println("转账动作前置打印...");
    }

    @DeclareParents(value = "com.example.rclack.spring2.day0210s.three.FinanceService+", defaultImpl = MoneyValidatorImpl.class)
    private MoneyValidator moneyValidator;
}
