package com.example.rclack.leetcode.day2;


//健身计划评估
public class UpperAndLower {


    public static void main(String[] args) {
        dietPlanPerformance(new int[]{1, 2, 3, 4, 5}, 1, 3, 3);
    }

    public static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int len = calories.length;
        int lowerSum = 0;
        int upperSum = 0;
        int[] pre = new int[len + 1];
        for(int i = 0; i < len; i++) {
            if(calories[i] < lower) {
                pre[i] = -1;
            }else if(calories[i] > upper) {
                pre[i] = 1;
            }else{
                pre[i] = 0;
            }
        }
        //维护一个当前窗口
        for (int i = 0; i < k; i++) {
        }
        int re = 0;
        int right = 0, left = 0;
        int rsum = 0,lsum = 0;
        while(right < pre.length){
            rsum += 1 - pre[right];
            while (rsum - lsum > k) {
                lsum += 1 - pre[left];
                left++;
//                lsum += 1 - nums[left++];
            }
            right++;
        }
        return re;
    }
}
