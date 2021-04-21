// Problem link: https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix/0
package com.lakshya.Matrix_Question;

import java.util.ArrayList;

public class SpirallTyraversingAMatrix {
    public static void main(String[] args) {
        int[][] mat = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		int row = mat.length;
		int column = mat[0].length;
		
        ArrayList<Integer> ans = spirallyTraverse(mat, row, column);

        System.out.println(ans);
    }

    static ArrayList<Integer> spirallyTraverse(int mat[][], int row, int column) {
        ArrayList<Integer> result = new ArrayList<>();
        if (mat == null || mat.length == 0) {
            return result;
        }

        // row
        int row_begin = 0;
        int row_end = row - 1;

        // column
        int col_begin = 0;
        int col_end = column - 1;

        while (row_begin <= row_end && col_begin <= col_end) { // valid condition
            // top
            for (int i = col_begin; i <= col_end; i++) {
                result.add(mat[row_begin][i]);
            }
            row_begin++;

            // right
            for (int i = row_begin; i <= row_end; i++) {
                result.add(mat[i][col_end]);
            }
            col_end--;

            if (row_begin <= row_end) {
                // bottom
                for (int i = col_end; i >= col_begin; i--) {
                    result.add(mat[row_end][i]);
                }
            }
            row_end--;

            if (col_begin <= col_end) {
                // left
                for (int i = row_end; i >= row_begin; i--) {
                    result.add(mat[i][col_begin]);
                }
            }
            col_begin++;
        }

        return result;
    }

}
