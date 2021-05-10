package com.lakshya.String;

public class WordWrap {
    public static int[][] solveWordWrap(int[] nums, int k) {
        int n = nums.length;
        int i, j;

        int currentLength;

        int cost;

        int[] dp = new int[n];
        int[] ans = new int[n];

        dp[n - 1] = 0;
        ans[n - 1] = n - 1;

        for (i = n - 2; i >= 0; i--) {
            currentLength = -1;
            dp[i] = Integer.MAX_VALUE;

            for (j = i; j < n; j++) {
                // 1 represent a space
                currentLength += (nums[j] + 1);

                // If limit of characters
                // is violated then no more
                // words can be added to
                // current line.
                if (currentLength > k) break;

                if (j == n - 1)
                    cost = 0;
                else
                    cost = (k - currentLength) * (k - currentLength) + dp[j + 1];

                if (cost < dp[i]) {
                    dp[i] = cost;
                    ans[i] = j;
                }
            }
        }

        int[][] result = new int[n][2];

        i = 0;
        int idx = 0;
        while (i < n) {
            result[idx][0] = i + 1;
            result[idx][1] = ans[i] + 1;
            idx++;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {7, 5, 6, 5, 6, 1, 8, 10, 8};
        int k = 12;

        int[][] resInts = solveWordWrap(nums, k);

        for (int[] arr : resInts) {
            System.out.println(java.util.Arrays.toString(arr));
        }
    }
}
