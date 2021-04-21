// Problem link: https://leetcode.com/problems/largest-rectangle-in-histogram/

package com.lakshya.DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
	
	static int[] dp = null;

	public static void main(String[] args) {
		int[] a = {7, 5, 1};
		int n = 18;

		dp = new int[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		
		int answer = minCoins(n, a, dp);
		
		System.out.println(answer);
	}
	
	public static int minCoins(int n, int[] a, int[] dp) { // Time complexity: O(mn)
		if (n == 0) {
			return 0;
		}

		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {

			int remainingRupees = n - a[i];
			if (remainingRupees >= 0) {
				int subAnswer = 0;

				if (dp[remainingRupees] != -1) {
					subAnswer = dp[remainingRupees];
				} else {
					subAnswer = minCoins(remainingRupees, a, dp);
				}

				ans = Math.min(ans, subAnswer + 1);
			}
		}

		return dp[n] = ans;
	}

}
