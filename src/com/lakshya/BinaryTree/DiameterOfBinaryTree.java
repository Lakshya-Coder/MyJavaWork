package com.lakshya.BinaryTree;

public class DiameterOfBinaryTree {
    static class Solution { 
        public int height(Node node) {
            if (node == null)
                return 0;

            return Math.max(height(node.right), height(node.left)) + 1;
        }

        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int currDiameter = (leftHeight + rightHeight) + 1;

            int leftDiameter = diameter(root.left);
            int rightDiameter = diameter(root.right);

            return Math.max(currDiameter, Math.max(leftDiameter, rightDiameter));
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        Solution solution = new Solution();
        System.out.println(solution.diameter(root));
    }
}
