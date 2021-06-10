package com.lakshya.leetcode;

public class EliminationGame {
    static class Solution {
        public int lastRemaining(int n) {
            boolean left = true;

            int remaining = n;
            int step = 1;
            int head = 1; // or you say result

            while (remaining > 1) {
                if (left || remaining % 2 == 1)
                    head = head + step;

                remaining = remaining / 2;
                step = step * 2;
                left = !left;
            }

            return head;
        }
    }

    public static void main(String[] args) {
        int n = 9;

        Solution solution = new Solution();

        System.out.println(solution.lastRemaining(n));
    }
}
