package com.example.rclack.level.current;

import java.util.Hashtable;

public class HashtableDemo {


    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key", "value");
        System.out.println(hashtable.get("key"));

    }
}
