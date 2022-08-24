package com.example.rclack.leetcode.day2022.day03.day0415;


import com.example.rclack.leetcode.day2022.TreeNode;

/**
 * 二叉树的堂兄弟节点
 */
public class Solution2 {

    int x;
    TreeNode xParent;
    int xDepth;
    boolean xFound = false;
    //y 的信息
    int y;
    TreeNode yParent;
    int yDepth;
    boolean yFound = false;

    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        dfs(root, 0, null);
        return xDepth == yDepth && xParent != yParent;
    }

    public void dfs(TreeNode node,int depth, TreeNode parent){
        if (node == null) {
            return;
        }
        if (node.val == x) {
            xParent = parent;
            xDepth = depth;
            xFound = true;
        } else if (node.val == y) {
            yParent = parent;
            yDepth = depth;
            yFound = true;
        }
        //如果两个节点都找到了，提前退出遍历
        //
        if (xFound && yFound) {
            return;
        }
        dfs(node.left, depth + 1, node);
        if (xFound && yFound) {
            return;
        }
        dfs(node.right, depth + 1, node);
    }


}
