package com.lakshya.Array_Question;

import java.util.*;

public class SticklerThief {
	static class Solution {
		static int[] dp;
		
		public int FindMaxSum(int arr[], int n) {
			dp = new int[n + 1];
			Arrays.fill(dp, -1);
			
			return helper(n - 1 /* i -> idx */, arr);		
		}

		private int helper(int i, int[] arr) {
			if (i <= -1) {
				return 0;
			}
			
			if (dp[i] != -1) {
				return dp[i];
			}
			
			int inc = arr[i] + helper(i - 2, arr); // include
			int exc = helper(i - 1, arr); // exclude
			
			return dp[i] = Math.max(inc, exc);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,5,10,100,10,5};
		
		Solution solution = new Solution();
		System.out.println(solution.FindMaxSum(arr, arr.length));
	}
}
