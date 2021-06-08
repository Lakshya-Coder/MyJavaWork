package com.lakshya.Array_Question;

public class MatrixDiagonalSum {
	static class Solution {
		public int diagonalSum(int[][] mat) {
			int n = mat.length;

			if (n == 1) {
				return mat[0][0];
			}

			int primarySum = 0, secondarySum = 0;

			int i = 0;
			int j = 0;

			while (i < n && j < n) {
				int cur = mat[i++][j++];

				primarySum = primarySum + cur;
			}

			i = 0;
			j = n - 1;

			while (i >= 0 && j >= 0) {
				int cur = mat[i++][j--];

				secondarySum = secondarySum + cur;
			}

			if (n % 2 != 0) {
				secondarySum = secondarySum - mat[n / 2][n / 2];
			}

			int sum = primarySum + secondarySum;
			return sum;
    	}
	}

	public static void main(String[] args) {
		int[][] mat = {{1,2,3},
		              {4,5,6},
		              {7,8,9}};

		Solution solution = new Solution();
		System.out.println(solution.diagonalSum(mat));
	}
}