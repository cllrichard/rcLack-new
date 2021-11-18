package com.example.rclack.leetcode.day1112;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        new Solution().smallestDistancePair(new int[]{1, 6, 1}, 3,false);
    }

    public int smallestDistancePair(int[] nums, int k, boolean trus) {
        Arrays.sort(nums);
        int WIDTH = 2 * nums[nums.length - 1];

        int[] multiplicity = new int[nums.length];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1]) {
                multiplicity[i] = 1 + multiplicity[i - 1];
            }
        }

        int[] prefix = new int[WIDTH];
        int left = 0;
        for (int i = 0; i < WIDTH; ++i) {
            while (left < nums.length && nums[left] == i) {
                left++;
            }
            prefix[i] = left;
        }

        int lo = 0;
        int hi = nums[nums.length - 1] - nums[0];
        while (lo < hi) {
            int mi = (lo + hi) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; ++i) {
                count += prefix[nums[i] + mi] - prefix[nums[i]] + multiplicity[i];
            }
            if (count >= k) hi = mi;
            else lo = mi + 1;
        }
        return lo;
    }


    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        PriorityQueue<Node> heap = new PriorityQueue<Node>(nums.length,
                Comparator.comparingInt(node -> nums[node.nei] - nums[node.root]));
        for (int i = 0; i + 1 < nums.length; ++i) {
            heap.offer(new Node(i, i + 1));
        }
        Node node = null;
        for (; k > 0; --k) {
            node = heap.poll();
            if (node.nei + 1 < nums.length) {
                heap.offer(new Node(node.root, node.nei + 1));
            }
        }
        return nums[node.nei] - nums[node.root];
    }


}

class Node{
    int root;
    int nei;

    public Node(int root, int nei) {
        this.root = root;
        this.nei = nei;
    }
}
