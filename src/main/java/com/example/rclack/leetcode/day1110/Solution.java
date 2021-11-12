package com.example.rclack.leetcode.day1110;

public class Solution {

    public static void main(String[] args) {
        //乘积小于 K 的子数组
//        new Solution().numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0);

        //环绕字符串中唯一的子字符串
        new Solution().findSubstringInWraproundString("zab");
    }



    public int findSubstringInWraproundString(String s) {
        int right = 0,left = 0,mid = 1;
        int len = s.length();
        char[] ch = s.toCharArray();
        int[] in = new int[26];
        while(right < len) {
            if(right > 0 && (ch[right] - ch[right - 1] == 1 || ch[right] - ch[right - 1] == -25 )){
                mid++;
            }else {
                mid = 1;
            }
            in[ch[right] - 'a'] = Math.max(mid,in[ch[right] - 'a']);
            right++;
        }
        int res = 0;
        for(int n : in) {
            res+= n;
        }
        return res;
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        return numsChildren(nums, k);
    }

    public int numsChildren(int[] nums,int k) {
        int len = nums.length;
        int res = 0;
        int right = 0,left = 0,count = 1;
        while(right < len) {
            count *= nums[right];
            while(left < len && count >= k) {
                count /= nums[left];
                left++;
            }
            right++;
            res += right - left;
        }
        return res < 0 ? 0 : res;
    }



}
