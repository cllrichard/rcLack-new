package com.example.rclack.leetcode.day2022.day03.day0318;

import com.example.rclack.leetcode.day2022.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
        new Solution().transferHeapToList(root);
    }
    public int[] transferHeapToList(TreeNode root) {
        if(root == null) {
            return new int[0];
        }
        List<List<Integer>> pre = levelOrder(root);
        List<Integer> list = new ArrayList();
        for (List<Integer> arr : pre) {
            for (int n : arr) {
                list.add(n);
            }
        }
        int[] res = new int[list.size()];
        int idx = 0;
        for(int n : list){
            res[idx] = n;
            idx++;
        }
        return res;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arrs = new ArrayList();
        level(root,arrs,0);
        return arrs;
    }

    static void level(TreeNode root,List<List<Integer>> arrs,Integer r){
        if(root == null) {
            return;
        }
        //level表示的是层数，如果level >= list.size()，说明到下一层了，所以
        //要先把下一层的list初始化，防止下面add的时候出现空指针异常
        if (r >= arrs.size()) {
            arrs.add(new ArrayList<>());
        }
        //level表示的是第几层，这里访问到第几层，我们就把数据加入到第几层
        arrs.get(r).add(root.val);
        level(root.left,arrs,r+1);
        level(root.right,arrs,r+1);
    }
}
