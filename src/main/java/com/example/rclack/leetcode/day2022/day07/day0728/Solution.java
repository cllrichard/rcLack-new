package com.example.rclack.leetcode.day2022.day07.day0728;

import com.example.rclack.leetcode.day2022.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class Solution {

    public String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        //
        queue.add(root);
        while (!queue.isEmpty()) {
            //
            TreeNode node = queue.poll();
            if (node == null) {
                res.append("#,");
                continue;
            }

            res.append(node + ",");
            queue.add(node.left);
            queue.add(node.right);
        }
        return res.toString();
    }

    public TreeNode deserialize(String data) {
        if (data == "#") {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        String[] values = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        queue.add(root);
        for (int i = 1; i < values.length; i++) {
            TreeNode parent = queue.poll();
            if (!"#".equals(values[i])) {
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                queue.add(left);
            }
            if (!"#".equals(values[++i])) {
                TreeNode right = new TreeNode(Integer.parseInt(values[i]));
                parent.right = right;
                queue.add(right);
            }
        }
        return root;
    }
}
