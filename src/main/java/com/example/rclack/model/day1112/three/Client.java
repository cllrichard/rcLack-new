package com.example.rclack.model.day1112.three;

import org.junit.Test;

public class Client {

    @Test
    public void show() {
        IHouse house = new House();
        house.live();
//        IStickyHookHouse stickyHookHouse = new StickyHookDecorator(house);
//        stickyHookHouse.live();
//        stickyHookHouse.hangThings();
        IMirrorHouse mirrorHouse = new MirrorDecorator(house);
        mirrorHouse.live();
        mirrorHouse.lookMirror();
    }
}
