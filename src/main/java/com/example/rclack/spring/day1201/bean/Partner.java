package com.example.rclack.spring.day1201.bean;

public class Partner {

    private String name;

    public Partner(String name) {
        this.name = name;
    }

    public void receiveMoney(int money) {
        System.out.println(name + "收到佣金：" + money + "元");
    }

    public void playWith(Player player) {
        System.out.println(name + "与" + player.getName() + "一起愉快玩耍");
    }

}
