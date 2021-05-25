package com.lakshya.BinaryTree;

import java.util.*;

public class ReverseLevelOrderTraversal {
    static class Solution {
        public ArrayList<Integer> reverseLevelOrder(Node node) {
            ArrayList<Integer> result = new ArrayList<>();

            Queue<Node> queue = new LinkedList<>();
            queue.add(node);

            while (!queue.isEmpty()) {
                Node currNode = queue.poll();

                result.add(currNode.data);

               if (currNode.right != null) 
                   queue.add(currNode.right);

               if (currNode.left != null)
                   queue.add(currNode.left);
            }

            Integer[] array = new Integer[result.size()];

            int idx = 0;
            for (int i = array.length - 1; i >= 0; i--) {
               array[idx++] = result.get(i); 
            }

            result = new ArrayList<>(Arrays.asList(array));

            return result;
        }

        public static void main(String[] args) {
            Node node = new Node(10, 
                new Node(20, new Node(40), new Node(60)),
                new Node(30));

            Solution solution = new Solution();
            System.out.println(solution.reverseLevelOrder(node));
        }
    }
}
