package com.example.rclack.leetcode.day2022.day03.day03019;

import com.example.rclack.leetcode.day2022.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    private int[] mPreorder;

    private List<Integer> mInorderList = new ArrayList<>();

    private int mPreorderIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        mPreorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            mInorderList.add(inorder[i]);
        }
        return createTree(0, inorder.length - 1);
    }

    private TreeNode createTree(int begin, int end) {
        if (begin > end) {
            return null;
        }

        TreeNode root = new TreeNode(mPreorder[mPreorderIndex]);
        int inIndex = mInorderList.indexOf(mPreorder[mPreorderIndex]);
        mPreorderIndex ++;
        root.left = createTree(begin, inIndex - 1);
        root.right = createTree(inIndex + 1, end);
        return root;
    }
}
