package com.example.rclack.spring2.day0210s.three;

import org.springframework.stereotype.Component;

@Component
public class MoneyValidatorImpl implements MoneyValidator {

    @Override
    public boolean validate(int money) {
        return money > 0;
    }
}
