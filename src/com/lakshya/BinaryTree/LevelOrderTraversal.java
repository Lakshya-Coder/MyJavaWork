package com.lakshya.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Solution {
        public ArrayList<Integer> levelOrder(Node node) {
            ArrayList<Integer> result = new ArrayList<>();

            Queue<Node> queue = new LinkedList<>();
            queue.add(node);

            while (!queue.isEmpty()) {
                Node currNode = queue.poll(); // This poll method did not through any exception

                if (currNode != null) {
                    result.add(currNode.data);

                    if (currNode.left != null) {
                        queue.offer(currNode.left); // This offer method did not through any exception

                    }

                    if (currNode.right != null) {
                        queue.offer(currNode.right);
                    }
                }
            }

            return result;
	    }
    }

    public static void main(String[] args) {
        Node node = new Node(10, 
                new Node(20, new Node(40), new Node(60)),
                new Node(30));

        Solution solution = new Solution();

        System.out.println(solution.levelOrder(node));
    }
}
