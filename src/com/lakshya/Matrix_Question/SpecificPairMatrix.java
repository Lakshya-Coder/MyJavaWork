package com.lakshya.Matrix_Question;

import java.util.Arrays;

public class SpecificPairMatrix {

    public static void printMat(int[][] mat, int n) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }

//    O(n^4), O(1)
    public static int findMaxValue(int[][] mat, int n) {
        int maxValue = Integer.MIN_VALUE;

//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1; j++)
//                for (int k = i + 1; k < n; k++)
//                    for (int l = j + 1; l < n; l++)
//                        maxValue = Math.max(maxValue, mat[k][l] - mat[i][j]);
//        }

        int[][] maxArr = new int[n][n];

        maxArr[n - 1][n - 1] = mat[n - 1][n - 1];

        // Preprocess last row
        int max_v = maxArr[n - 1][n - 1];
        for (int j = n - 2; j >= 0; j--) {
            if (mat[n - 1][j] > max_v)
                max_v = mat[n - 1][j];
            // Math.max(max_v, mat[n - 1][j]);
            maxArr[n - 1][j] = max_v;
        }

        // Preprocess last column
        max_v = maxArr[n - 1][n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (mat[i][n - 1] > max_v)
                max_v = mat[i][n - 1];
            // Math.max(max_v, mat[i][n - 1]);
            maxArr[i][n - 1] = max_v;
        }

        // Preprocess the rest of the matrix from bottom
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                if (maxArr[i + 1][j + 1] - mat[i][j] > maxValue) {
                    maxValue = maxArr[i + 1][j + 1] - mat[i][j];
                }
                maxArr[i][j] = Math.max(mat[i][j],
                        Math.max(maxArr[i][j + 1], maxArr[i + 1][j]));
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 6, 1, 3 },
                { -4, -1, 1, 7, -6 },
                { 0, -4, 10, -5, 1 }
        };
        int n = mat.length;
        int ans = findMaxValue(mat, n);

        System.out.print("Maximum Value is " +
                ans);
    }

}
