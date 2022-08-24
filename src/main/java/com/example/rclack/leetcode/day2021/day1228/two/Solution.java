package com.example.rclack.leetcode.day2021.day1228.two;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        new Solution().threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
    }

    public int threeSumClosest(int[] nums, int targets) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int threesum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum - targets) > Math.abs(threesum - targets)) {
                    sum = threesum;
                }
                if (threesum > targets) r--;
                else if(threesum < targets) l++;
                else return targets;
            }
        }
        return sum;
    }
}
