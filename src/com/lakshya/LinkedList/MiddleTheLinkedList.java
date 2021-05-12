package com.lakshya.LinkedList;

public class MiddleTheLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1,
                new LinkedList(2,
                        new LinkedList(10, new LinkedList(4,
                                new LinkedList(5,
                                        new LinkedList(121))))));

        System.out.println(Solution.middleNode(linkedList).val);
    }

    static class Solution {
        public static LinkedList middleNode(LinkedList head) {
//            LinkedList temp = head;
//            int count = 0;
//
//            while (temp != null) {
//                count++;
//                temp = temp.next;
//            }
//
//            count /= 2;
//            int i = 0;
//            LinkedList ans = new LinkedList(0, null);
//
//            while (i <= count) {
//                ans = head;
//                head = head.next;
//                i++;
//            }

//            return ans;

            //         ListNode[] listNode = new ListNode[100];

//         int t = 0;

//         while (head != null) {
//             listNode[t++] = head;
//             head = head.next;
//         }

//         // The length of the head ListNode -> t
//         return listNode[t / 2];

            LinkedList slow = head;
            LinkedList fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
    }
}
