package com.example.rclack.spring2.day0210s.three;

import org.springframework.stereotype.Service;

@Service
public class FinanceService {

    public void transfer(Long source, Long target, int money) {
        System.out.println("转账完成!");
        System.out.println(source + " 为 " + target + " 转钱 " + money + " 元 !");
    }

}
