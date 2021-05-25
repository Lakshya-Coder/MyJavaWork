package com.lakshya.BinaryTree;

import java.util.*;


public class LeftViewOfBinaryTree {
    static class Solution {
        ArrayList<Integer> leftView(Node root) {
            ArrayList<Integer> res = new ArrayList<>();
            if (root == null) 
                return res;
            
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            
            while (!queue.isEmpty()) {
                int currentSize = queue.size();
                Node currentNode = queue.peek();

                res.add(currentNode.data);

                while (currentSize -- != 0) {
                    Node temp = queue.poll();

                    if (temp.left != null) {
                        queue.add(temp.left);
                    }

                    if (temp.right != null) {
                        queue.add(temp.right);
                    }
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left.right = new Node(8);

        Node.inorder(root);
    }
}
