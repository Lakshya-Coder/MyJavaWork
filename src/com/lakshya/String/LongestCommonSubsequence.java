package com.lakshya.String;

public class LongestCommonSubsequence {
    public static int lcs(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];

        for (int i = dp.length - 2; i >= 0; i--) {
            for (int j = dp[0].length - 2; j >= 0; j--) {
                char c1 = a.charAt(i);
                char c2 = b.charAt(j);

                if (c1 == c2) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        System.out.println(lcs("ABCDGH", "AEDFHR"));
    }
}
