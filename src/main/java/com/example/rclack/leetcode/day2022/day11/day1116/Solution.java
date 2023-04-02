package com.example.rclack.leetcode.day2022.day11.day1116;

public class Solution {


    public static void main(String[] args) {
        new Solution().rob(new int[]{1, 2, 3, 1});
    }
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int N = nums.length;
        int[] dp = new int[N + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int k = 2; k <= N; k++) {
            dp[k] = Math.max(dp[k - 1], nums[k - 1] + dp[k - 2]);
        }
        return dp[N];
    }
}
