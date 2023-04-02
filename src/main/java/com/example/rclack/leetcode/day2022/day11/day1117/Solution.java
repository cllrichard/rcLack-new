package com.example.rclack.leetcode.day2022.day11.day1117;

public class Solution {


    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }

        if (length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[length];
        int max = 0;
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length - 1; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        max = dp[length - 2];
        dp = new int[length];
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1], nums[2]);
        for (int i = 3; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        max = Math.max(max, dp[length - 1]);
        return max;

    }
}
