package com.lakshya.LinkedList;

public class AddTwoNumber {
    static class Solution {
        public LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
            LinkedList answer = new LinkedList(0);
            LinkedList dummy = answer;

            int carry = 0;

            while (l1 != null || l2 != null) {
                int l1Val = l1 != null ? l1.val : 0;
                int l2Val = l2 != null ? l2.val : 0;

                int sum = l1Val + l2Val + carry;
                carry = sum / 10;

                int lastValue = sum % 10;

                LinkedList newNode = new LinkedList(lastValue);
                dummy.next = newNode;
                dummy = dummy.next;

                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }

            if (carry > 0) {
                LinkedList newNode = new LinkedList(carry);
                dummy.next = newNode;
            }

            return answer.next;
        }
    }

    public static void printList(LinkedList root) {
        LinkedList temp = root;

        while (temp != null) {
            System.out.println(temp.val);
            
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(2);

        l1.next = new LinkedList(4);
        l1.next.next= new LinkedList(3);

        LinkedList l2 = new LinkedList(5);
    
        l2.next = new LinkedList(6);
        l2.next.next = new LinkedList(4);

        Solution solution = new Solution();

        printList(solution.addTwoNumbers(l1, l2));
    }
}
