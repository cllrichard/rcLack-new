package com.example.rclack.leetcode.day2021.day1;


//1151. 最少交换次数来组合所有的 1
public class DataSum {

    public static void main(String[] args) {
        minSwaps(new int[]{1, 0, 1, 0, 1});
    }


    /**
     * 计算原数组 data 中 1 的个数 totalOne。
     * 维护一个长度为 totalOne 的窗口，计算窗口中 1 的个数。先遍历求出第一个窗口 1 的个数，并保存好这个数字，记为 countOne。
     * 向右移动窗口，继续计算 1 的个数。假设当前下标为 i，那么需要加上当前的数字，
     * 再减去移出窗口的数字，移出窗口的下标为 i - totalOne。所以新的窗口 1 的个数为 countOne += data[i] - data[i-totalOne]。
     * 求 countOne 的最大值，和 totalOne 相减就是我们要求的结果。
     * @param data
     * @return
     */
    public static int minSwaps(int[] data) {
        int len = data.length;
        int totalOne = 0;
        int zero = 0;
        //得到为1的个数
        for(int i = 0; i < len; i++) {
            totalOne += data[i];
        }
        int currentOne = 0;
        for (int i = 0; i < totalOne; i++) {
            currentOne += data[i];
        }
        if(totalOne == 1) {
            return 0;
        }
        int right = totalOne, left = 0;
        int result = currentOne;
        while(right < len) {
            currentOne += data[right] - data[right - totalOne];
            result = Math.max(currentOne, result);
            right++;
        }
        return totalOne - result;
    }
}
