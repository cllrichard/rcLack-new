package com.example.rclack.leetcode.day2022.day03.day0415;

import com.example.rclack.leetcode.day2022.TreeNode;

import java.util.*;

public class Solution {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(4);
//        new Solution().levelOrder(root);
        new Solution().isCousins(root, 3, 4);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        List<List<Integer>> list = new ArrayList();
        if(root == null) return false;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> res = new ArrayList();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                res.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            list.add(res);
        }
        for(List<Integer> res : list) {
            if(res.indexOf(x) != -1 && res.indexOf(y) != 1){
                return true;
            }
        }
        return false;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        int temp = 2;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> res = new ArrayList();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                res.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null)queue.add(node.right);
                temp++;
            }
            list.add(res);
        }
        return list;
    }
}
