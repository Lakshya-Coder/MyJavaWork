package com.lakshya.BinaryTree;

public class CreateAMirrorBinaryTree {
    static class Solution {
        public void mirrorTree(Node root) {
            if (root == null) {
                return;
            }

            Node temp = root.left;

            root.left = root.right;
            root.right = temp;

            mirrorTree(root.left);
            mirrorTree(root.right);
        }

        public void inorder(Node root) {
            if (root == null) {
                return;       
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);

        root.left = new Node(1);
        root.right = new Node(8);

        root.left.left = new Node(12);
        root.right.right = new Node(9);

        Solution solution = new Solution();

        solution.mirrorTree(root);
        solution.inorder(root);
    }   
}
