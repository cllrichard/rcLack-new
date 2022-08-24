package com.example.rclack.spring.day1201.bean2;

import com.example.rclack.spring.day1201.bean.Player;

public class IndividualPartner implements Partner {

    private String name;

    public IndividualPartner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void receiveMoney(int money) {
        System.out.println(name + "收到佣金：" + money + "元");
    }

    @Override
    public void playWith(Player player) {
        System.out.println(name + "与" + player.getName() + "一起愉快玩耍!");
    }

}
