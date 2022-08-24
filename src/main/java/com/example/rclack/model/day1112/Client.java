package com.example.rclack.model.day1112;

import org.junit.Test;

public class Client {
    @Test
    public void test() {
        Component boss = new Managers("老板", "唱怒放的生命");
        Component HR = new Employees("人力资源", "聊微信");
        Component PM = new Managers("产品经理", "不知道干啥");
        Component CFO = new Managers("财务主管", "看剧");
        Component CTO = new Managers("技术主管", "划水");
        Component UI = new Employees("设计师", "画画");
        Component operator = new Employees("运营人员", "兼职客服");
        Component webProgrammer = new Employees("程序员", "学习设计模式");
        Component backgroundProgrammer = new Employees("后台程序员", "CRUD");
        Component accountant = new Employees("会计", "背九九乘法表");
        Component clerk = new Employees("文员", "给老板递麦克风");
        boss.addComponent(HR);
        boss.addComponent(PM);
        boss.addComponent(CFO);
        PM.addComponent(UI);
        PM.addComponent(CTO);
        PM.addComponent(operator);
        CTO.addComponent(webProgrammer);
        CTO.addComponent(backgroundProgrammer);
        CFO.addComponent(accountant);
        CFO.addComponent(clerk);

        boss.check();

    }


}
