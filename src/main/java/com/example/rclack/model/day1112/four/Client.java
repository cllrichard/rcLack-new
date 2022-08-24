package com.example.rclack.model.day1112.four;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        System.out.println("上班：");
        Browser.open();
        IDE.open();
        Wechat.open();

        System.out.println("下班:");
        Browser.close();
        IDE.close();
        Wechat.close();
    }
}
