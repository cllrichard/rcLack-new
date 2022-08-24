package com.example.rclack.leetcode.day2021.day1123;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        ListNode node = new ListNode(0, null);
//        node.next = new ListNode(1, null);
//        new Solution().removeNthFromEnd(node, 1);
//        new Solution().addBinary("11", "10");
//        new Solution().singleNumber(new int[]{2, 2, 2, 1});
//        new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
//        LongAdder longAdder = new LongAdder();
//        AtomicLong atomicLong = new AtomicLong();
//        atomicLong.addAndGet(1L);
//        atomicLong.addAndGet(1L);
//        atomicLong.addAndGet(1L);
//        atomicLong.addAndGet(1L);
//        longAdder.add(1);
//        longAdder.add(1);
//        longAdder.add(1);
//        longAdder.add(1);
//        longAdder.add(1);
//        longAdder.add(1);
//        Set<Character> set = new HashSet();
        new Solution().maxProduct(new String[]{"a", "ab", "abc", "d", "cd", "bcd", "abcd"});
    }

    public int maxProduct(String[] words) {
        int len = words.length;
        int res = 0;
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0; i < len; ++i) {
            String sign = words[i];
            Set<Character> set = new HashSet();
            char[] ch = sign.toCharArray();
            boolean mid = false;
            for(int j = 0; j < ch.length;++j) {
                if(!set.add(ch[j])){
                    mid = true;
                    break;
                }
            }
            if(!mid) {
                map.put(i,ch.length);
            }
        }

        int left = 0,right = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            left = entry.getValue();
            if(left > right) {
                res = Math.max(left * right , res);
            }
        }
        return res;
    }

    public int maxArea(int[] height) {
        int len = height.length;
        if(len < 2) {
            return 0;
        }
        int left = 0, right = len - 1;
        int mid = 0;
        while(left < right) {
            int minValue = Math.min(height[left],height[right]);
            mid = Math.max(mid,(left - right) * minValue);
            if(height[right] == minValue) {
                right--;
            }else{
                left++;
            }
        }
        return mid;
    }

    public int singleNumber(int[] nums) {
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0; i < len; i++) {
            map.put(nums[i],map.get(nums[i]) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getValue();
            }
        }
        return -1;

    }



    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = a.length() - 1, j = b.length() - 1;
        while( i >= 0 || j >= 0 || carry != 0) {
            int res = carry;
            if(i >= 0) {
                res += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0) res += b.charAt(j--) - '0';
            sb.append(res % 2);
            carry = res / 2;
        }
        return sb.reverse().toString();
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new LinkedList<>();
        ListNode cur = dummy;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; ++i) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}