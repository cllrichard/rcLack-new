package com.example.rclack.leetcode.day2022.day11.day1107.one;

import com.example.rclack.leetcode.day2022.TreeNode;

public class Solution {

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int cumsum) {
        if (node == null) {
            return 0;
        }
        cumsum = 10 * cumsum + node.val;
        if (node.left == null && node.right == null) {
            return cumsum;
        }
        return dfs(node.left, cumsum) + dfs(node.right, cumsum);
    }
}























