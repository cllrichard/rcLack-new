package com.example.rclack.spring.day1201.bean2;


import com.example.rclack.spring.day1201.bean.Player;

public interface Partner {

    void receiveMoney(int money);

    void playWith(Player player);

//    private String name;
//
//    public Partner(String name) {
//        this.name = name;
//    }
//
//    public void receiveMoney(int money) {
//        System.out.println(name + "收到佣金：" + money + "元");
//    }
//
//    public void playWith(Player player) {
//        System.out.println(name + "与" + player.getName() + "一起愉快玩耍");
//    }

}

