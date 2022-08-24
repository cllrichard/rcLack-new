package com.example.rclack.leetcode.day2021.day1119;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
//        new Solution().containsNearbyAlmostDuplicate(new int[]{1, 2, 3, 1}, 3, 0,false);
        kEmptySlots(new int[]{1, 3, 2}, 1);
    }

    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> large = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        PriorityQueue<Integer> small = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            if (small.isEmpty() || small.peek() <= nums[i]) {
                small.offer(nums[i]);
            }else {
                large.offer(nums[i]);
            }
        }

        return 0;
    }

    public static int kEmptySlots(int[] bulbs, int k) {
        int len = bulbs.length;
        int[] flowers = new int[len];
        for(int i = 0; i < len; i++) {
            flowers[bulbs[i] - 1] = i + 1;
        }
        int st = 0, en = k + 1;
        int ans = Integer.MAX_VALUE;
        for(int i = st + 1; en < len; ++i) {
            if(flowers[i] > flowers[st] && flowers[i] > flowers[en])
                continue;
            if(i == en) {
                ans = Math.min(ans,Math.max(flowers[st],flowers[en]));
            }
            st = i;
            en = st + k + 1;
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t, boolean ta) {
        int n = nums.length;
        TreeSet<Long> set = new TreeSet<Long>();
        for (int i = 0; i < n; i++) {
            Long ceiling = set.ceiling((long) (nums[i] - (long)t));
            if (ceiling != null && ceiling <= (long)nums[i] + (long)t) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long)nums[i - k]);
            }
        }
        return false;
    }


    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        Map<Long, Long> map = new HashMap<>();
        long w = t + 1;
        for (int i = 0; i < n; i++) {
            long id = getID(nums[i], w);
            if (map.containsKey(id)) {
                return true;
            }
            if (map.containsKey(id - 1) && Math.abs(nums[i] - map.get(id - 1)) < w) {
                return true;
            }
            if (map.containsKey(id + 1) && Math.abs(nums[i] - map.get(id + 1)) < w) {
                return true;
            }
            map.put(id, (long) nums[i]);
            if (i >= k) {
                map.remove(getID(nums[i - k], w));
            }
        }
        return false;
    }

    public static long getID(long x, long w) {
        if (x >= 0) {
            return x / w;
        }
        return (x + 1) / w -1;
    }
}
