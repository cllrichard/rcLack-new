package com.example.rclack.model.day1116;

import java.util.ArrayList;
import java.util.List;
//-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
//堆 内存溢出
public class HeapOOM {

    static class OOMObject{}

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }

}
