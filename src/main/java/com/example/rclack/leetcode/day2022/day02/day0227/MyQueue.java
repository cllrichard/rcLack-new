package com.example.rclack.leetcode.day2022.day02.day0227;

import java.util.Deque;
import java.util.LinkedList;

//FIFO  先进先出
//LIFO  后进先出
public class MyQueue<E> {

    Deque<Integer> inStack;

    Deque<Integer> outStack;

    public MyQueue() {
        inStack = new LinkedList<>();
        outStack = new LinkedList<>();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.peek();
        myQueue.pop();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }


//    public static void main(String[] args) {
////        LinkedList linkedList = new LinkedList();
////        linkedList.add(1);
////        linkedList.add(2);
////        linkedList.add(3);
//
//        MyQueue myQueue = new MyQueue();
//        myQueue.add(1);
//        myQueue.add(2);
//        myQueue.add(3);
//
//    }
//    transient int size = 0;
//
//    /**
//     * Pointer to first node.
//     */
//    transient Node<E> first;
//
//    /**
//     * Pointer to last node.
//     */
//    transient Node<E> last;
//
//    private static class Node<E> {
//        E item;
//        Node<E> next;
//        Node<E> prev;
//
//        Node(Node<E> prev, E element, Node<E> next) {
//            this.item = element;
//            this.next = next;
//            this.prev = prev;
//        }
//    }
//
//    public boolean add(E e) {
//        linkLast(e);
//        return true;
//    }
//
//    void linkLast(E e) {
//        final Node<E> l = last;
//        final Node<E> newNode = new Node<>(l, e, null);
//        last = newNode;
//        if (l == null)
//            first = newNode;
//        else
//            l.next = newNode;
//        size++;
//    }


}
