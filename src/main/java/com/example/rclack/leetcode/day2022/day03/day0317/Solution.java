package com.example.rclack.leetcode.day2022.day03.day0317;

import com.example.rclack.leetcode.day2022.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(89);
//        root.left.left = new TreeNode(36);
//        root.left.left.left = new TreeNode(33);
//        root.left.left.right = new TreeNode(30);
        root.left.right = new TreeNode(36);
//        root.left.right.left = new TreeNode(27);
//        root.right = new TreeNode(56);
//        root.right.left = new TreeNode(79);
//        root.right.right = new TreeNode(20);
        new Solution().isLegalHeap(root);
    }

    List<Integer> list = new ArrayList<>();
    int idx = 0;

    public boolean isLegalHeap(TreeNode root) {
        boolean target = false;
        if(root.left == null && root.right == null){
            if (root.left != null) {
                 target = isCompleteTree(root.left);
            }
            return true;
        }
        boolean max =  buildMax(root.left,root.val) && buildMax(root.right,root.val);
        idx = 0;
        boolean min = buildMin(root.left,root.val) && buildMin(root.right,root.val);
        return (max || min) && idx < 2;
    }
    public boolean isCompleteTree(TreeNode root) {
        List<ANode> nodes = new ArrayList();
        nodes.add(new ANode(root, 1));
        int i = 0;
        while (i < nodes.size()) {
            ANode anode = nodes.get(i++);
                if (anode.node != null) {
                    nodes.add(new ANode(anode.node.left, anode.code * 2));
                    nodes.add(new ANode(anode.node.right, anode.code * 2 + 1));
                }
            }
        return nodes.get(i-1).code == nodes.size();
    }

    public boolean buildMax(TreeNode root,int val) {
        if(root == null) {
            return true;
        }
        if(root.left != null && root.right == null) {
            idx++;
        }
        if(root.left == null && root.right != null) {
            idx++;
        }
        if(root.val <= val) {
            return  buildMax(root.right,root.val) && buildMax(root.left,root.val);
        }
        return false;
    }

    public boolean buildMin(TreeNode root, int val) {
        if(root == null) {
            return true;
        }
        if(root.left != null && root.right == null) {
            idx++;
        }
        if(root.left == null && root.right != null) {
            idx++;
        }
        if(root.val >= val) {
            return  buildMin(root.right,root.val) && buildMin(root.left,root.val);
        }
        return false;
    }

    class ANode {  // Annotated Node
        TreeNode node;
        int code;
        ANode(TreeNode node, int code) {
            this.node = node;
            this.code = code;
        }
    }

}
