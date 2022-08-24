package com.example.rclack.leetcode.day2022.day02.day0221;

public class Solution {

   static class ListNode {
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.val = 1;
        listNode.next = new ListNode(2);
        listNode.next.next = listNode;
        new Solution().detectCycle(listNode);
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode slow = head,fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            }else {
                return null;
            }
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
