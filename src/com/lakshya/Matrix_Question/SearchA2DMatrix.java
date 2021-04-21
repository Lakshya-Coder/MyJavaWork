// Problem link: https://leetcode.com/problems/search-a-2d-matrix/
package com.lakshya.Matrix_Question;

import java.util.Scanner;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, m = 0, target = Integer.MIN_VALUE;

        System.out.print("Enter row: ");
        n = sc.nextInt();
        System.out.print("Enter column: ");
        m = sc.nextInt();

        int[][] matrix = new int[n][m]; /*(n * m matrix)*/

        System.out.println("Enter matrix: ");
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                matrix[i][j] = sc.nextInt();

        System.out.print("Enter target: ");
        target = sc.nextInt();

        System.out.println(searchMatrix(matrix, target));

        sc.close();
    }
    
    public static boolean searchMatrix(int[][] matrix, int target) {
    	// Problem url: https://leetcode.com/problems/search-a-2d-matrix/
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int row = 0;
        int column = matrix[0].length - 1;

        while (row >= 0 && row < matrix.length/* row */ && column >= 0 && column < matrix[0].length/* column */) {
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }

        return false;
    }
}
