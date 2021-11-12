package com.example.rclack.model.day1112.five;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        Person person = new Person();
        PersonProxy proxy = new PersonProxy(person);
//        person.eat();
//        person.sleep();
        proxy.eat();
        proxy.sleep();
    }
}
