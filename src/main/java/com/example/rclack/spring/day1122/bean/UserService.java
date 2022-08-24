package com.example.rclack.spring.day1122.bean;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void get(String id) {
        System.out.println("获取id为" + id + "的用户。。。");
    }

    public void save(String name) {
        System.out.println("保存name" + name + "的用户。。。");
    }

}
