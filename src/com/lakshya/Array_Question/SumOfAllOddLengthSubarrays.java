package com.lakshya.Array_Question;

public class SumOfAllOddLengthSubarrays {
    static class Solution {
        public int sumBetween(int[] arr, int start, int end) {
            if (start > 0)
                return arr[end] - arr[start - 1];
            return arr[end];
        }

        public int sumOddLengthSubarrays(int[] arr) {
            int n = arr.length;

            if (n == 1) {
                return arr[0];
            }

            // Calculating prefix sum
            for (int i = 1; i < n; i++) {
                arr[i] += arr[i - 1];
            }

            int sum = 0;
            // Finding the sum of odd length subarray
            for (int start = 0; start < n; start++)
                for (int end = start; end < n; end = end + 2/* We are geting a odd place*/)
                    sum = sum + sumBetween(arr, start, end);
            return sum;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,11,12};

        Solution solution = new Solution();
        System.out.println(solution.sumOddLengthSubarrays(arr));
    }
}
