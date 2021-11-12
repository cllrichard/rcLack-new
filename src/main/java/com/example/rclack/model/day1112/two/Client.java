package com.example.rclack.model.day1112.two;

import org.junit.Test;

public class Client {

    @Test
    public void show() {
        IBeauty me = new Me();
        System.out.println("我原本颜值:" + me.getBeautyValue());

        IBeauty meWithRing = new RingDecorator(me);

        System.out.println("戴上了戒指后，我的颜值: " + meWithRing.getBeautyValue());
    }
}
