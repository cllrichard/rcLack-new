package com.example.rclack.model.day1114;

public class Invokedynamic {


}

class GrandFather{
    void thinking() {
        System.out.println("i am grandfather");
    }
}

class Father extends GrandFather {
    void thinking() {
        System.out.println("i am father");
    }
}

class Son extends Father {
    void thinking() {

    }
}