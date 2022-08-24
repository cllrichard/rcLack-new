package com.example.rclack.leetcode.day2022.day02.day0207;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        new Solution().getLeastNumber(new int[]{3,2,1,5,6,4}, 2);
    }

    public int getLeastNumber(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return 0;
        }
        // 默认是小根堆，实现大根堆需要重写一下比较器。
        Queue<Integer> pq = new PriorityQueue<>((v1, v2) -> v1 - v2);
        for (int num: arr) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
//
//        // 返回堆中的元素
//        int[] res = new int[pq.size()];
//        int idx = 0;
//        for(int num: pq) {
//            res[idx++] = num;
//        }
//        return res;
//
//        Queue<Integer> queue = new PriorityQueue<>((x1, x2) -> x2 - x1);
//        for (int num : arr) {
//            if (queue.size() < k) {
//                queue.offer(num);
//            } else if(num < pq.peek()){
//                queue.poll();
//                queue.offer(num);
//            }
//        }
//        int[] res = new int[queue.size()];
//        int idx = 0;
//        for (int num : queue) {
//            res[idx++] = num;
//        }
//        return res;
    }
}
