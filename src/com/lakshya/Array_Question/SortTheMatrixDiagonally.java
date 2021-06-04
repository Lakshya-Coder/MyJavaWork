package com.lakshya.Array_Question;

import java.util.*;

public class SortTheMatrixDiagonally {
    static class Solution {
        public void sort(int[][] mat, int row, int col, int m, int n) {
//            ArrayList<Integer> values = new ArrayList<>();

            int[] values = new int[101];

            int r = row;
            int c = col;

            while (r < m && c < n) {
//                values.add(mat[r++][c++]);
                values[mat[r][c]]++;

                r++;
                c++;
            }

//            Collections.sort(values);
            
            r = row;
            c = col;

            for (int i = 1; i < 101; i++) {
                int count = values[i];

                if (count > 0) {
                    while (count-- > 0) {
                        mat[r][c] = i;

                        r++;
                        c++;
                    }
                } 
            }

//            int idx = 0;
//            while (r < m && c < n) {
//                mat[r++][c++] = values.get(idx++);
//            }
        }

        public int[][] diagonalSort(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;

            for (int col = 0; col < n; col++) {
                sort(mat, 0, col, m, n);
            }

            for (int row = 0; row < n; row++) {
                sort(mat, row, 0, m, n);
            }

            return mat;
        }
    }

    public static void printMat(int[][] mat) {
        for (int[] arr : mat)
            System.out.println(java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[][] mat  = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};

        Solution solution = new Solution();
        mat = solution.diagonalSort(mat);

        printMat(mat);
    }
}
