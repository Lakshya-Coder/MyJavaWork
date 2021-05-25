package com.lakshya.BinaryTree;

public class HeightOfBinaryTree {
    static class Solution {
        public int height(Node node) { 
            if (node == null) {
                return 0;
            }

            return Math.max(height(node.left), height(node.right)) + 1;
        }
    }

    public static void main(String[] args) {
            Node node = new Node(1, null, new Node(2, new Node(3), null));

            Solution solution = new Solution();
            System.out.println(solution.height(node));
    }
}
