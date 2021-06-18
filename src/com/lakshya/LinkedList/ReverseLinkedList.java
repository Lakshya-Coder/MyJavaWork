package com.lakshya.LinkedList;

// import java.util.Stack;

public class ReverseLinkedList {
    static class Solution {
        public LinkedList reverseLinkedList(LinkedList rootNode) {
            if (rootNode == null || rootNode.next == null) {
                return null;
            }

            LinkedList prev = null;
            LinkedList curr = rootNode;
            LinkedList next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            rootNode = prev;

            return rootNode;
        }
    }

    public static void main(String[] args) {
        LinkedList rootNode = new LinkedList(1,
                new LinkedList(2,
                        new LinkedList(3,
                                new LinkedList(4,
                                        null))));

        Solution solution = new Solution();

        rootNode = solution.reverseLinkedList(rootNode);

        while (rootNode != null) {
            System.out.println(rootNode.val);
            rootNode = rootNode.next;
        }
    }
}
