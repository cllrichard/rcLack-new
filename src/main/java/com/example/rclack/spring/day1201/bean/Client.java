package com.example.rclack.spring.day1201.bean;

public class Client {

    public static void main(String[] args) {
//        Player player = new Player("战士");
//        Partner partner = new Partner("盗贼");
//
//        partner.receiveMoney(200);
//        partner.playWith(player);
        Player player = new Player("盗贼");
        Partner partner = PartnerPlatform.getPartner(10000);
        partner.receiveMoney(20);
        partner.playWith(player);
    }
}
