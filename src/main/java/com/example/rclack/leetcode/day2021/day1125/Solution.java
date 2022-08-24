package com.example.rclack.leetcode.day2021.day1125;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
//        new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//        new Solution().minSubArrayLen(15, new int[]{5, 1, 3, 5, 10, 7, 4, 9, 2, 8});
        new Solution().numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100);
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k == 0) {
            return 0;
        }
        int len = nums.length; // 保留基本
        int res = 0;
        int[] pre = new int[len + 1];
        pre[0] = 1;
        for(int i = 1; i < pre.length; i++) {
            if(nums[i - 1] < k) res++; //根据提示，单个值有大于K值的数字
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        //计算连续的数据
        int left = 1, right = 1;
        int mid = 0;
        while(right < pre.length && left < pre.length) {
            mid = pre[right];
            while(mid < k) {
                mid = pre[right];
                res++;
                right++;
            }
            mid  = pre[left++];
            right++;
        }
        return res;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int res = Integer.MAX_VALUE;
        int mid = 0;
        int left = 1, right = 1;
        int[] pre = new int[len + 1];
        for (int i = 1; i < pre.length; i++) {
            pre[i] = nums[i - 1] + pre[i - 1];
        }
        if (pre[pre.length - 1] < target ){
            return 0;
        }
        while(right < pre.length) {
            mid = pre[right];
            while(mid >= target) {
                mid = pre[right];
                res = Math.min(res,right - left + 1);
                mid -= pre[left++];
            }
            right++;
        }
        return res == Integer.MAX_VALUE? 0 : res;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        // 枚举 a
        for (int first = 0; first < n; ++first) {
            // 需要和上一次枚举的数不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            // c 对应的指针初始指向数组的最右端
            int third = n - 1;
            int target = -nums[first];
            // 枚举 b
            for (int second = first + 1; second < n; ++second) {
                // 需要和上一次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}
