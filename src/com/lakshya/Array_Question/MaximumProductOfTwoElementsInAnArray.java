package com.lakshya.Array_Question;

public class MaximumProductOfTwoElementsInAnArray {
	static class Solution {
		public int maxProduct(int[] nums) {
        	// Brute Force -> O(n^2)

			// int n = nums.length;
			// int res = Integer.MIN_VALUE;

   //      	for (int i = 0; i < n; i++)
   //      		for (int j = i + 1; j < n; j++) 
   //      			res = Math.max(res, (nums[i] - 1) * (nums[j] - 1));
    	
   //      	return res;
			int n = nums.length;

			int largestVal = 0;
			int largestValIdx = 0;

			int smallestVal = 0;

			for (int i = 0; i < n; i++) {
				int cur = nums[i];

				if (largestVal < cur) {
					largestVal = cur;
					largestValIdx = i;
				}
			}

			for (int i = 0; i < n; i++) {
				int cur = nums[i];

				if (smallestVal < cur && largestVal >= cur && i != largestValIdx) {
					smallestVal = cur;
				}
			}

			return (largestVal - 1) * (smallestVal - 1);
    	}
	}

	public static void main(String[] args) {
		int[] nums = {3, 4, 5, 2};

		Solution solution = new Solution();
		System.out.println(solution.maxProduct(nums));
	}
}