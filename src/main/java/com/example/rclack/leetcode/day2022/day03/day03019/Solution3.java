package com.example.rclack.leetcode.day2022.day03.day03019;

import com.example.rclack.leetcode.day2022.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    private int[] mPreorder;

    private List<Integer> mInorderList = new ArrayList<>();

    private int mPreoderIndex = 0;

    public static void main(String[] args) {

        new Solution3().buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        mPreorder = postorder;
        mPreoderIndex = postorder.length - 1;
        for(int i=0;i<inorder.length;i++) {
            mInorderList.add(inorder[i]);
        }
        return createTree(0, inorder.length-1);
    }

    private TreeNode createTree(int begin, int end) {
        if(begin > end ) {
            return null;
        }
        if (mPreoderIndex < 0) {
            return null;
        }
        TreeNode root = new TreeNode(mPreorder[mPreoderIndex]);
        int inIndex = mInorderList.indexOf(mPreorder[mPreoderIndex]);
        mPreoderIndex --;
        root.left = createTree(begin, inIndex-1);
        root.right = createTree(inIndex+1, end);
        return root;

    }
}
