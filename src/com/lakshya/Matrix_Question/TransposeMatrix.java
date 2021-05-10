package com.lakshya.Matrix_Question;

public class TransposeMatrix {
    static void transpose(int matrix[][], int n) {
        // column -> row
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {{3, 2, 1},
        {6, 5, 4},
        {9, 8, 7}};

        transpose(mat, mat.length);

        for (int[] arr : mat) {
            System.out.println(java.util.Arrays.toString(arr));
        }
    }
}
