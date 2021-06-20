package com.lakshya.BitManipulation;

public class ReverseBits {
    static class Solution {
        public int reverseBits(int n) {
            int reversedBits = 0;

            for (int i = 0; i < 32; i++) {
                // createing a space in reversedBits
                reversedBits <<= 1; // reversedBits << 2

                if ((n & 1) != 0/** Checking 0th or last bit is on or not */)
                    reversedBits |= 1;

                n >>= 1; // Changing the 0th or last bit
            }

            return reversedBits;

            // return Integer.reverse(n);
        }
    }

    public static void main(String[] args) {
        int n = 1011111111;
        Solution solution = new Solution();

        System.out.println(solution.reverseBits(n));
    }
}
