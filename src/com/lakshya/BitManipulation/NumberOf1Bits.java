package com.lakshya.BitManipulation;

public class NumberOf1Bits {
	static class Solution {
		public int hammingWeight(int n) {
			int ans = 0;

			for (int i = 31; i >= 0; i--) {
				int mask = (1 << i);

				if ((n & mask) != 0) {
					ans++;
				}
			}

			return ans;
		}
	}

	public static void main(String[] args) {
		int n = 00000000000000000000000000001011;

		Solution solution = new Solution();
		System.out.println(solution.hammingWeight(n));
	}
}