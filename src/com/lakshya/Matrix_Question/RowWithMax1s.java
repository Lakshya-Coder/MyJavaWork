// Problem link: https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
package com.lakshya.Matrix_Question;

public class RowWithMax1s {
	public static void main(String[] args) {
		int[][] arr = {{0, 1, 1, 1}, // 0
		           {0, 0, 1, 1}, // 1
		           {1, 1, 1, 1}, // 2
		           {0, 0, 0, 0}}; // 3

		System.out.println(rowWithMax1s(arr, arr.length, arr[0].length));
	}
	
	public static int rowWithMax1s(int[][] arr, int n, int m) {
		int j = m - 1;
		while (j >= 0 && arr[0][j] == 1) { // Finding the no of 1 in the first row
			j--; // m - j = number of 1
		}

		int row = 0;
		for (int i = 1; i < n; i++) {
			while (j >= 0 && arr[i][j] == 1) {
				j--;
				row = i;
			}
		}

		if (j != m - 1)
			return row;
		else
			return -1;
    }
}
