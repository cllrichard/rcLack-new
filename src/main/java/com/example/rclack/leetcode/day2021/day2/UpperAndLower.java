package com.example.rclack.leetcode.day2021.day2;


//健身计划评估
public class UpperAndLower {


    public static void main(String[] args) {
        dietPlanPerformance(new int[]{6,13,8,7,10,1,12,11}, 6, 5, 37);
    }

    public static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int len = calories.length;
        int right = 0, left = 0,re = 0;
        int mid = 0,curr = 1;
        int[] pre = new int[len + 1];
        for (int i = 0; i < len; i++) {
            pre[i + 1] += pre[i] + calories[i];
        }
        for (int i = 0; i < len - k + 1; i++) {
            re = pre[i + k] - pre[i];
            if(re < lower) {
                mid -= 1;
            }else if (re > upper){
                mid += 1;
            }
        }
        return mid;
    }
}
