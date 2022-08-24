package com.example.rclack.leetcode.day2021.day;


//至多包含两个不同字符的最长子串
//至多包含 K 个不同字符的最长子串
public class Solution {


    public static void main(String[] args) {
//        lengthOfLongestSubstringTwoDistinct("eceba");
//        test("a");
        lengthOfLongestSubstringKDistinct("a", 1);
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int len = s.length();
        if(k == 0) {
            return 0;
        }
        int right = 0,left = 0;
        char[] ch = s.toCharArray();
        int[] pre = new int[128];
        int count = 0 , re = k;

        while(right < len) {
            pre[ch[right]]++;
            if(pre[ch[right]] == 1) {
                count ++;
            }
            right++;
            while (count == k + 1) {
                pre[ch[left]] --;
                if(pre[ch[left]] == 0) {
                    count--;
                }
                left++;
            }
            re = Math.max(re,right - left);
        }
        return re;
    }

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        int len = s.length();
        if (len < 3) {
            return len;
        }

        char[] charArray = s.toCharArray();
        int[] freq = new int[26];
        // 滑动窗口里不同字符的个数
        int count = 0;

        int res = 2;
        int left = 0;
        int right = 0;
        while (right < len) {
            freq[charArray[right] - 'a']++;
            if (freq[charArray[right] - 'a'] == 1) {
                count++;
            }
            right++;

            while (count == 3) {
                freq[charArray[left] - 'a']--;
                if (freq[charArray[left] - 'a'] == 0) {
                    count--;
                }
                left++;
            }
            // 退出循环以后有 count = 2，因此在这里选出最大值
            res = Math.max(res, right - left);
        }
        return res;
    }


    public static int test(String s) {
        int len = s.length();
        int right = 0,left = 0;
        char[] ch = s.toCharArray();
        int[] pre = new int[26];
        int count = 0 , re = 2;

        while(right < len) {
            pre[ch[right] - 'a']++;
            if(pre[ch[right] - 'a'] == 1) {
                count ++;
            }
            right++;
            while (count == 3) {
                pre[ch[left] - 'a'] --;
                if(pre[ch[left] - 'a'] == 0) {
                    count--;
                }
                left++;
            }
            re = Math.max(re,right - left);
        }
        return re;
    }


}
