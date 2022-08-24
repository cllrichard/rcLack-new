package com.example.rclack.leetcode.day2021.day1202;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Solution {


    public static void main(String[] args) {
//        new Solution().threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        copyOnWriteArrayList.add("123");
        copyOnWriteArrayList.add("21");
        copyOnWriteArrayList.add("43");
        List list = copyOnWriteArrayList.subList(0, 2);
        System.out.println(list);
    }


    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int best = 10000000;

        for (int i = 0; i < n; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return target;
                }
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }
                if (sum > target) {
                    int k0 = k - 1;
                    while (j < k0 && nums[k0] == nums[k]) {
                        --k0;
                    }
                    k = k0;
                } else {
                    int j0 = j + 1;
                    while (j0 < k && nums[j0] == nums[j]) {
                        ++j0;
                    }
                    j = j0;
                }
            }
        }
        return best;
    }
}
