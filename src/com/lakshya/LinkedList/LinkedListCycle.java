package com.lakshya.LinkedList;

public class LinkedListCycle {
    public boolean hasCycle(LinkedList head) {
        if (head == null || head.next == null) return false;
        LinkedList fast = head;
        LinkedList slow = head;

        fast = fast.next.next;
        slow = slow.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast != null && fast.val == slow.val) return true;
        }

        return false;
    }
}
