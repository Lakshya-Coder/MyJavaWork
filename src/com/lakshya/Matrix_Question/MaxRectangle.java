// Problem link: https://practice.geeksforgeeks.org/problems/max-rectangle/1
package com.lakshya.Matrix_Question;

import java.util.*;

public class MaxRectangle {

	public static int maxHist(int[] row, int n, int m) { // Problem name is: Maximum rectangle in the histogram

		Stack<Integer> st = new Stack<>(); // We use Stack the for maintaining previous index in a order.
//		The main point to use a Stack it decreases the time complexity of our program.

		int topOfStack, maxArea = 0, area;

		int i = 0;
		while (i < m) {
		    if (st.isEmpty() || row[st.peek()] <= row[i])
		        st.add(i++);
            else {
                topOfStack = row[st.pop()];
				area = topOfStack * (st.isEmpty() ? i : (i - st.peek() - 1));
                maxArea = Math.max(maxArea, area);
            }
        }

		while (!st.isEmpty()) {
//		    int i = m; // If we not declare i variable at the top of the while() loop, so we need
//		    to create this i variable and assign the length of row(row.length).

		    topOfStack = row[st.pop()];
			area = topOfStack * (st.isEmpty() ? i : (i - st.peek() - 1));
		    maxArea = Math.max(maxArea, area);
        }

		return maxArea;
	}

	public static int maxArea(int mat[][], int n, int m) {
		int result = maxHist(mat[0], n, m);

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int curr = mat[i][j];
				boolean currIs1 = curr == 1;

				if (currIs1)
					mat[i][j] += mat[i - 1][j];
				result = Math.max(result, maxHist(mat[i], n, m));
			}
		}

        return result;
    }

    public static void main(String[] args) {
		int[][] mat = { {0, 1, 1, 0},
						{1, 1, 1, 1},
				        {1, 1, 1, 1},
				        {0, 1, 1, 1} };

		int n = mat.length;
		int m = mat[0].length;

		int ans = maxArea(mat, n, m);
		System.out.print("Answer is: " + ans);
    }
}
