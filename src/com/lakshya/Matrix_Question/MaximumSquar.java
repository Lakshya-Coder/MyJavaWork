// Problem link: https://practice.geeksforgeeks.org/problems/largest-square-formed-in-a-matrix0806/1
package com.lakshya.Matrix_Question;

public class MaximumSquar {

    static int maxSquare(int n, int m, int mat[][]) {
        if (mat == null)
            return -1;

        if (n == 0)
            return 0;
        else if (n == 1 || m == 1) {
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    if (mat[i][j] == 1)
                        return 1;
        }

        int i, j;
        int answer = mat[0][0];
        
        int[][] dp = new int[n][m];

        // Set first column of dp[][]
        for (i = 0; i < n; i++)
            dp[i][0] = mat[i][0];

        // Set first row of dp[][]
        for (j = 0; j < m; j++)
            dp[0][j] = mat[0][j];

        // Construct other entries of dp[][]
        for (i = 1; i < n; i++) {
            for (j = 1; j < m; j++) {
                if (mat[i][j] == 1) {
                    dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                }

                answer = Math.max(answer, dp[i][j]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] mat = { { 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 } };

        int answer = maxSquare(mat.length, mat[0].length, mat);
        System.out.println(answer);
    }

}
