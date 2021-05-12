package com.lakshya.LinkedList;

public class ConvertBinaryNumberInLinkedListInteger {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1,
                new LinkedList(0, new LinkedList(1, null)));

        System.out.println(Solution.getDecimalValue(linkedList));
    }

    static class Solution {
        private static int binaryToDecimal(String str) {
            int decimal = 0;
            int base = 1;

            int n = str.length();
            for (int i = n - 1; i >= 0; i--) {
                if (str.charAt(i) == '1')
                    decimal += base;
                base *= 2;
            }

            return decimal;
        }

        public static int getDecimalValue(LinkedList head) {
            String str = "";

            while (head != null) {
                char x = (head.val == 1) ? '1' : '0';
                str = str + x;

                head = head.next;
            }

            return binaryToDecimal(str);
        }
    }
}
