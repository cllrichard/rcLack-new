package com.example.rclack.model.day1214.one;

import com.example.rclack.model.day1214.IPerson;
import com.example.rclack.model.day1214.Person;

public class PersonProxy implements IPerson {

    private final Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
