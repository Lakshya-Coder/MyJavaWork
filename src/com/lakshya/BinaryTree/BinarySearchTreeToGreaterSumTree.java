package com.lakshya.BinaryTree;

public class BinarySearchTreeToGreaterSumTree {
    static class Solution {
        int[] count = new int[101];
    
        private void fillTheCount(Node root) {
            if (root != null) {
                count[root.data] = 1;
                
                fillTheCount(root.left);
                fillTheCount(root.right);
            }
        }
        
        public Node bstToGst(Node root) {
            fillTheCount(root);
            
            if (root != null) {
                int curr = root.data;
                
                int sum = curr;
                
                for (int i = curr + 1; i < 101; i++) {
                    if (count[i] != 0) {
                        sum += i;
                    }
                }
                
                root.data    = sum;
                
                bstToGst(root.left);
                bstToGst(root.right);
            }
            
            return root;
        }
    }
}
