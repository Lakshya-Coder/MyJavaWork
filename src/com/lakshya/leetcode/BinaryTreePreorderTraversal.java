package com.lakshya.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    static class TreeNode {
        int val;

        TreeNode left;
        TreeNode right;

        public TreeNode() {}

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        List<Integer> result = new ArrayList<>();

        public void helper(TreeNode root) {
            if (root == null) {
                return;
            }

            result.add(root.val);
            helper(root.left);
            helper(root.right);
        }

        public List<Integer> preorderTraversal(TreeNode root) {
            helper(root);

            return result;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        Solution solution = new Solution();
        System.out.println(solution.preorderTraversal(treeNode));
    }
}
