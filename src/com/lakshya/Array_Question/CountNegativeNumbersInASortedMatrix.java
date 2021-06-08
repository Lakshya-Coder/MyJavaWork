package com.lakshya.Array_Question;

public class CountNegativeNumbersInASortedMatrix {
	static class Solution {
		public int cntNegatives(int[] nums) {
			int cnt = 0;

			for (int num : nums)
				if (num < 0)
					cnt++;

			return cnt;
		}

		public int countNegatives(int[][] grid) {
      //   	int cnt = 0;

      //   	int n = grid.length;
      //   	for (int i = 0; i < n; i++)
      //   		cnt += cntNegatives(grid[i]);
    		
    		// return cnt;

    		// a >= b >= c >= d
    		int n = grid.length;
    		int m = grid[0].length;

    		int i = 0;
    		int j = m - 1;

    		int cnt = 0;

    		while (i < n && j >= 0) {
    			if (grid[i][j] < 0) {
    				cnt += n - i;
    				j--;
    			} else {
    				i++;
    			}
    		}

    		return cnt;
    	}
	}

	public static void main(String[] args) {
		int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

		Solution solution = new Solution();
		System.out.println(solution.countNegatives(grid));
	}
}