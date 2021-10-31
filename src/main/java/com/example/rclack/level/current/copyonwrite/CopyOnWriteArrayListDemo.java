package com.example.rclack.level.current.copyonwrite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {
//        ArrayList<Object> objects = new ArrayList<>();
        CopyOnWriteArrayList<Object> objects = new CopyOnWriteArrayList<>();
        objects.add("1");
        objects.add("2");
        objects.add("3");
        objects.add("4");
        objects.add("5");

        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()) {
            System.out.println("list is " + objects);
            String next = (String) iterator.next();
            if (next.equals("2")) {
                objects.remove("5");
            }
            if (next.equals("3")) {
                objects.add("3 found");
            }
            System.out.println(next);
        }
    }
}
