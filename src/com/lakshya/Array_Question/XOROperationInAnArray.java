package com.lakshya.Array_Question;

public class XOROperationInAnArray {
    static class Solution {
        public int xorOperation(int n, int start) {
//         int[] nums = new int[n];

//         for (int i = 0; i < n; i++) {
//             nums[i] = start + 2 * i;
//         }

//         int result = start;
//         for (int i = 1; i < n; i++) {
//             result ^= nums[i];
//         }

//         return result;

            int result = start;
            for (int i = 1; i < n; i++) {
                result ^= start + 2 * i;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.xorOperation(4, 3));
    }
}
