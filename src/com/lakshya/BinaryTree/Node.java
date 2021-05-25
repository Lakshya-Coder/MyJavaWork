package com.lakshya.BinaryTree;

public class Node {
    int data;
    Node left;
    Node right;

    public Node() {}

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
