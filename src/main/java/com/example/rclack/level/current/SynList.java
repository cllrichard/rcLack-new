package com.example.rclack.level.current;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

//Collections.synchronizedList(new ArrayList<>()); 保存线程不安全的ArrayList
public class SynList {

    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        list.add(5);
        System.out.println(list.get(0));
        Map map = new HashMap();

    }
}
