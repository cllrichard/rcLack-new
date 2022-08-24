package com.example.rclack.leetcode.day2022.day02.day0213;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        new Solution().calculate("2 - 1 + 2 / 2");
    }
    public int calculates(String s) {
//        Deque<Integer> stack = new LinkedList<>();
//        char preSign = '+';
//        int num = 0;
//        int n = s.length();
//        for (int i = 0; i < n; ++i) {
//            if (Character.isDigit(s.charAt(i))) {
//                num = num * 10 + s.charAt(i) - '0';
//            }
//            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {
//                switch (preSign) {
//                }
//            }
        return 0;
//        }
    }
        public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        char preSign = '+';
        int num = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {
                switch (preSign) {
                    case '+' :
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    default:
                        stack.push(stack.pop() / num);
                }
                preSign = s.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
