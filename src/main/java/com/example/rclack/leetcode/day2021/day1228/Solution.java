package com.example.rclack.leetcode.day2021.day1228;

public class Solution {

    public static void main(String[] args) {
        new Solution().reverseVowels("leetcode");
    }

    public String reverseVowels(String s) {
        int n = s.length();
        int left = 0, right = n - 1;
        char[] ch = s.toCharArray();
        while (left < right) {
            while (left < n && !isVowel(ch[left])) left++;
            while (right > 0 && !isVowel(ch[right])) right--;
            if (left < right) {
                swap(left++, right--,ch);
            }
        }
        return ch.toString();
    }
    void swap(int s,int  s1,char [] ch) {
        char t = ch[s];
        ch[s] = ch[s1];
        ch[s1] = t;
    }

    boolean isVowel(char c) {
        if ((c == 'a' || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U'))) {
            return true;
        }
        return false;
    }
}
