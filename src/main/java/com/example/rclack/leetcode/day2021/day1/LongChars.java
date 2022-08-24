package com.example.rclack.leetcode.day2021.day1;


//长度为 K 的无重复字符子串
public class LongChars {

    public static void main(String[] args) {
        numKLenSubstrNoRepeats("havefunonleetcode", 5);
    }

    public static int numKLenSubstrNoRepeats(String s, int k) {
        int len = s.length();
        int right = 0,left = 0,mid = 0;
        char[] ch = s.toCharArray();
        int[] in = new int[26];
        while(right < len) {
            in[ch[right] - 'a']++;
            while(in[ch[right] - 'a'] > 1) {
                in[ch[left++] - 'a']--;
            }
            if(right - left + 1 >= k){ //符合
                mid++;
            }
            right++;
        }
        return mid;
    }
}
