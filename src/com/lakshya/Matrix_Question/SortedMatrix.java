// Problem link: https://practice.geeksforgeeks.org/problems/sorted-matrix/0
package com.lakshya.Matrix_Question;

import java.util.Arrays;

public class SortedMatrix {

	public static void youngify(int[][] mat, int i, int j) {
		int INF = Integer.MAX_VALUE;
		int lengthOfMat = mat.length;
		
		// Find the value at down and right sides mat[i][j]
		int downValue = (i + 1 < lengthOfMat) ? mat[i + 1][j] : INF;
		int rightValue = (j + 1 < lengthOfMat) ? mat[i][j + 1] : INF;
		
		// If mat[i][j] is down right corner element
		// return
		if (downValue == INF && rightValue == INF) {
			return;
		}
		
		// Move the smaller of two value
		// (downValue and rightValue) to mat[i][j]
		// and recur of smaller value
		if (downValue < rightValue) {
			mat[i][j] = downValue;
			mat[i + 1][j] = INF;
			youngify(mat, i + 1, j);
		} else {
			mat[i][j] = rightValue;
			mat[i][j + 1] = INF;
			youngify(mat, i, j + 1);
		}
	}

	public static int fetchMin(int[][] mat) {
		int ret = mat[0][0];

		mat[0][0] = Integer.MAX_VALUE;
		youngify(mat, 0, 0);

		return ret;
	}

	public static int[][] printSortedMat(int[][] mat) {
		int n = mat.length;
		int[][] tmp = new int[n][n];

		// for (int i = 0; i < mat.length * mat.length; i++) {
		// 	System.out.print(fetchMin(mat) + " ");
		// }

		for (int i = 0; i < n; i++) 
			for (int j = 0; j < n; j++)
				tmp[i][j] = fetchMin(mat);
		mat = tmp.clone();
		return mat;
	}

	public static void printMat(int[][] mat) {
		int n = mat.length;

		for (int i = 0; i < n; i++) 
			System.out.println(Arrays.toString(mat[i]));
	}

	public static void main(String[] args) {
		int[][] mat = { {40, 94, 73, 98, 27},
					    {58, 89, 87, 95, 9},
					    {95, 28, 34, 74, 32},
					    {19, 46, 78, 64, 80},
					    {72, 62, 86, 16, 99} };
		printMat(printSortedMat(mat));
	}

}