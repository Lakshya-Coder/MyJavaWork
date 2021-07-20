package MiddleOfTheLinkedList;

public class Main {
   public ListNode middleNode(ListNode head) {
      ListNode slow = head, fast = head;

      while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
      }

      return slow;
   }

}

class ListNode {
   int val;
   ListNode next;

   public ListNode() {
   }

   ListNode(int val) {
      this.val = val;
   }

   ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
   }
}