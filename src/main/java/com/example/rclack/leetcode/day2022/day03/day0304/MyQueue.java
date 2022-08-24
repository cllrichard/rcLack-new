package com.example.rclack.leetcode.day2022.day03.day0304;


import com.example.rclack.leetcode.day2022.Node;

public class MyQueue {

    private int size;

    private Node node;

    public MyQueue() {
        size = 0;
    }

    public void push(int x) {
        Node root = new Node(x);
        root.next = node;
        node = root;
        size++;
    }

    public int size() {
        return size;
    }

    public void pop() {
        node = node.next;
    }

    public int peek() {
        if (size == 0) {
            return -1;
        }
        int n = node.value;
        node = node.next;
        size--;
        return n;
    }



}
