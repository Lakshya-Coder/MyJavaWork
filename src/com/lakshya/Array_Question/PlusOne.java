package com.lakshya.Array_Question;

public class PlusOne {
   static class Solution {
        public int[] plusone(int[] digits) {
            int n = digits.length;

            for (int i = 0; i < n; i++) {
                int curr = digits[i];

                if (curr < 9) {
                    digits[i]++;

                    return digits;
                } else {
                    digits[i] = 0;
                }
            }

            int[] result = new int[n + 1];
            result[0] = 1;

            return result;
        }
   } 

    public static void main(String[] args) {
        int[] digits = {9};
        Solution solution = new Solution();

        System.out.println(java.util.Arrays.toString(solution.plusone(digits)));
    }
}
