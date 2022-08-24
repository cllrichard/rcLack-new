package com.example.rclack.leetcode.day2022.day02.day0213;

public class LCQueue {

    public static void main(String[] args) {
        LCQueue lcQueue = new LCQueue();
        lcQueue.push(1);
        lcQueue.push(2);
        lcQueue.push(3);
        lcQueue.push(4);
        lcQueue.front();
        lcQueue.pop();
        lcQueue.front();
    }

    private int size;
    private Node head;
    private Node tail;

    public LCQueue() {
        size = 0;
        head = tail = new Node(0);
    }

    public void push(int x) {
        tail.next = new Node(x);
        tail.next.prev = tail;
        tail = tail.next;
        size++;
    }

    public void pop() {
        if (head.next.next != null) {
            head.next.next.prev = head;
            head.next = head.next.next;
        } else {
            //删除前只剩下1个元素
            tail = head;
            head.next = null;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public int front() {
        return head.next.value;
    }

    private static class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }



}
