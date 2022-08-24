package com.example.rclack.leetcode.day2022.day02.day0211;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
//        new Solution().isValid(")))()(())(()(()())(())))(()())))()(()((((()");
//        new Solution().scoreOfParentheses("(()(()))");
        new Solution().calculate("(2-1)");
    }

    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        int res = 0, num = 0,sign = 1;
        Deque<Integer> storage = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == ' ') continue;
            if ('0' <= c && c <= '9') {
                num = num * 10 + (c - '0');
                continue;
            }
            res += sign * num;
//            res = res - storage.peek() + (storage.peek() / sign * num); // 保证 碰到 除数是对的
            num = 0;
            if (c == '+') {
                sign = stack.peek();
            } else if (c == '-') {
                sign = -stack.peek();
            } else if (c == '(') {
                stack.push(sign);
            } else if (c == ')') {
                stack.pop();
            }
        }
        res += sign * num;
        return res;
    }



    public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack();
        stack.push(0); // The score of the current frame

        for (char c: S.toCharArray()) {
            if (c == '(')
                stack.push(0);
            else {
                int v = stack.pop();
                int w = stack.pop();
                stack.push(w + Math.max(2 * v, 1));
            }
        }

        return stack.pop();
    }


    public boolean isValid(String s) {
        long n = s.length();
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(char c : chars) {
            if(c == '(') stack.push(')');
            else if (c == ')') stack.push('(');
            else if (stack.isEmpty() || c != stack.pop()) return false;
        }
        return stack.isEmpty();
    }
}
