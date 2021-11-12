package com.example.rclack.leetcode.day1108;

public class Solution {

    public int subArraysWithKDistinct(int[] nums, int k) {
        int n = atMostKDistinct(nums, k);
        int n1 = atMostKDistinct(nums, k - 1);
        return n - n1;
    }

    private int atMostKDistinct(int[] nums, int k) {
        int len = nums.length;
        int[] freq = new int[len + 1];
        int left = 0;
        int right = 0;
        //
        int count = 0;
        int res = 0;
        while (right < len) {
            if (freq[nums[right]] == 0) {
                count++;
            }
            freq[nums[right]]++;
            right++;
            while (count > k) {
                freq[nums[left]]--;
                if (freq[nums[left]] == 0) {
                    count--;
                }
                left++;
            }
            res += right - left;
        }
        return res;
    }
}
