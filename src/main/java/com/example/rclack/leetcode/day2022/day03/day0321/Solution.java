package com.example.rclack.leetcode.day2022.day03.day0321;

import com.example.rclack.leetcode.day2022.TreeNode;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(38);
        root.left.left = new TreeNode(97);
//        root.left.left.left = new TreeNode(33);
//        root.left.left.right = new TreeNode(30);
//        root.left.right = new TreeNode(36);
//        root.left.right.left = new TreeNode(27);
        root.right = new TreeNode(94);
//        root.right.left = new TreeNode(79);
//        root.right.right = new TreeNode(20);
        new Solution().levelOrder(root);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);  //层级
                }
                if (node.right != null) {
                    queue.offer(node.right); //层级
                }
            }
            ret.add(level);
        }
        return ret;
    }

}
