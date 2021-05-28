package com.lakshya.BinaryTree;

import java.util.*;

public class RightViewOfBinaryTree {
    static class Solution {
        ArrayList<Integer> rightView(Node node) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            if (node == null) {
                return arrayList;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(node);

            while (!queue.isEmpty()) {
                int n = queue.size();

                // while (n -- != 0) {
                //     Node temp = queue.poll();

                //     if (temp.left != null) queue.offer(temp.left);
                //     if (temp.right != null) queue.offer(temp.right);
                // }

                for (int i = 1; i <= n; i++) {
                    Node temp = queue.poll();

                    if (i == n) {
                        arrayList.add(temp.data);
                    }

                    if (temp.left != null) queue.offer(temp.left);
                    if (temp.right != null) queue.offer(temp.right);
                }
            }

            return arrayList;
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

        Solution solution = new Solution();
        System.out.println(solution.rightView(root));
    }
}
