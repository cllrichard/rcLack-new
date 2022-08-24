package com.example.rclack.leetcode.day2022.day03.day0314;

public class KthLargest {

    private TreeNode root;
    private int k;

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        kthLargest.add(3);
        kthLargest.add(5);
        kthLargest.add(10);

    }

    public KthLargest(int k, int[] nums) {
        root = null;
        for (int num : nums) {
            root = insert(root, num, 1);
        }
        this.k = k;
    }

    public int add(int val) {
        root = insert(root, val, 1);
        return search(root, k);
    }


    private TreeNode insert(TreeNode node, int val, int yours) {
        if (node == null) return new TreeNode(val, yours);
        else if (val <= node.val) {
            pushDown(node);
            node.left = insert(node.left, val, node.count + 1);
        }else {
            node.count++;
            node.left_mark += 1;
            pushDown(node);
            node.right = insert(node.right, val, node.count - 1);
        }
        return node;
    }

    private int search(TreeNode node, int k) {
        if (node == null) {
            return Integer.MIN_VALUE;
        } else if (k == node.count) {
            return node.val;
        }else if (k > node.count) {
            pushDown(node);
            return search(node.left, k);
        }else {
            pushDown(node);
            return search(node.right, k);
        }
    }

    private void pushDown(TreeNode node) {
        if (node.left != null) {
            node.left.left_mark += node.left_mark;
            node.left.right_mark += node.left_mark;
            node.left.count += node.left_mark;
        }
        if (node.right != null) {
            node.right.left_mark += node.right_mark;
            node.right.right_mark += node.right_mark;
            node.right.count += node.right_mark;
        }
    }



    class TreeNode{
        int val;

        int count;

        int left_mark,right_mark;
        TreeNode left,right;

        public TreeNode(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }
}
