package com.example.rclack.leetcode.day3;

public class Solution {


    public static void main(String[] args) {
        numSubarrayBoundedMax(new int[]{7,3,6,7,1}, 1, 4);
    }

//    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
////        int len = nums.length;
////        int r = 0, l = 0,re = 0;
////        int[] pre = new int[len + 1];
////
////        for(int i = 0; i < len; i++) {
////            pre[i + 1] = pre[i] + nums[i];
////        }
////        for(int i = 1; i< pre.length; i++){
////            int si = pre[i] - pre[l];
////            if(si <= right) {
////                re++;
////            }
////            l++;
////        }
////        return re;
//    }

    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = lessEqualsThan(nums, right);
        int ns = lessEqualsThan(nums, left - 1);
        return  n - ns;
    }

    private static int lessEqualsThan(int[] nums, int k) {
        int len = nums.length;
        int res = 0;
        // 循环不变量：nums[left..right] 里的所有元素都小于等于 k
        for (int left = 0, right = 0; right < len; right++) {
            if (nums[right] > k) {
                left = right + 1;
            }
            res += right - left;
        }
        return res;
    }

}
