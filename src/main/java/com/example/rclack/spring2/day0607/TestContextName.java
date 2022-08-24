package com.example.rclack.spring2.day0607;

import org.springframework.beans.factory.InitializingBean;

public class TestContextName implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPo");
    }
}
