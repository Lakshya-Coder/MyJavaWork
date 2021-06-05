package com.lakshya.BinaryTree;

public class BinarySearchTreeToGreaterSumTree {
    static class Solution {
        int[] count = new int[101];
    
        private void fillTheCount(TreeNode root) {
            if (root != null) {
                count[root.val] = 1;
                
                fillTheCount(root.left);
                fillTheCount(root.right);
            }
        }
        
        public TreeNode bstToGst(TreeNode root) {
            fillTheCount(root);
            
            if (root != null) {
                int curr = root.val;
                
                int sum = curr;
                
                for (int i = curr + 1; i < 101; i++) {
                    if (count[i] != 0) {
                        sum += i;
                    }
                }
                
                root.val = sum;
                
                bstToGst(root.left);
                bstToGst(root.right);
            }
            
            return root;
        }
    }
}
