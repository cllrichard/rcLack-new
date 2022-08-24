package com.example.rclack.leetcode.day2022.day07.day0727;

import com.example.rclack.leetcode.day2022.Node;
import com.example.rclack.leetcode.day2022.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {


    public void levelOrder(TreeNode tree) {
        if (tree == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            //
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Node cur = root;
        while (cur != null) {
            Node dummy = new Node(0);
            Node pre = dummy;
            while (cur != null) {
                if (cur.left != null) {
                    pre.next = cur.left;
                    pre = pre.next;
                }
                if (cur.right != null) {
                    pre.next = cur.right;
                    pre = pre.next;
                }
                cur = cur.next;
            }
            cur = dummy.next;
        }
        return root;
    }
}
