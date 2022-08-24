package com.example.rclack.leetcode.day2021.day1;


//无重复的字符最长子串
public class LongChar {

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0,right = 0,res = 0;
        int len = s.length();
        char[] ch = s.toCharArray();
        int[] in = new int[128];
        while(right < len) {
            in[ch[right] - 'a']++;
            while(in[ch[right] - 'a'] > 1) {
                in[ch[left++] - 'a']--;
            }
            res = Math.max(right - left + 1,res);
            right++;
        }
        return res;
    }
}
