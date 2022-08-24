package com.example.rclack.leetcode.day2022.day02.day0110;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        new Solution().findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3);
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ret = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int n = ret.size();
        if (x <= ret.get(0)) {
            return ret.subList(0, k);
        } else if (ret.get(n - 1) <= x) {
            return ret.subList(n - k, n);
        }else {
            Object key;
            Comparator c;
            int index = Collections.binarySearch(ret, x);
            if (index < 0) {
                index = -index - 1;
            }
            int low = Math.max(0, index - k - 1), high = Math.min(ret.size() - 1, index + k - 1);
            while (high - low > k - 1) {
                if ((x - ret.get(low)) <= (ret.get(high) - x)) {
                    high--;
                } else if ((x - ret.get(low)) > (ret.get(high - x))) {
                    low++;
                }else {
                    System.out.println("unhandled case: " + low + " " + high);
                }
            }
            return ret.subList(low, high + 1);
        }
    }
}
