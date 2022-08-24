package com.example.rclack.leetcode.day2022.day03.day0301;

import com.example.rclack.leetcode.day2022.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<Integer, Integer> indexMap;

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }
        //前序遍历的第一个节点就是根节点
        int preorder_root = preorder_left;

        // 在中序遍历中定位根节点
        int inorder_root = indexMap.get(preorder[preorder_root]);

        //先把根节点建立出来
        TreeNode root = new TreeNode(preorder[preorder_root]);

        //得到 左子树的节点数目
        int size_left_subtree = inorder_root - inorder_left;

        //递归地构造左子树，并连接到根节点
        root.left = myBuildTree(preorder, inorder, preorder_left + 1,
                preorder_left + size_left_subtree, inorder_left, inorder_root - 1);

        root.right = myBuildTree(preorder, inorder,
                preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }



    public static void main(String[] args) {
        TreeNode node = new Solution().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        System.out.println();
    }

}
