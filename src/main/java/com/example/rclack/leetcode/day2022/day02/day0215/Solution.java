package com.example.rclack.leetcode.day2022.day02.day0215;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        new Solution().maxSlidingWindow(new int[]{9, 11}, 2);
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0;
        int res;
        int temp;
        List<Integer> list = new ArrayList();
        while(i < nums.length - k + 1) {
            temp = 0;
            res = Integer.MIN_VALUE;
            while(temp < k) {
                res = Math.max(nums[i + temp],res);
                temp++;
            }
            list.add(res);
            i++;
        }
        int[] re= new int[list.size()];
        int m = 0;
        for(int n : list) {
            re[m++] = n;
        }
        return re;
    }
}
