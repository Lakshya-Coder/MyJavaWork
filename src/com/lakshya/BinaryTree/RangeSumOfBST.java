package com.lakshya.BinaryTree;

public class RangeSumOfBST {
    public class Solution { 
        public int rangeSumBST(Node root, int low, int high) {
            if (root == null) return 0;
            if (root.data < low) return rangeSumBST(root.right, low, high);
            if (root.data > high) return rangeSumBST(root.left, low, high);
        
            return root.data + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
    } 
}
