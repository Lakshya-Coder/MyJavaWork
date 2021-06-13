package com.lakshya.SearchingAndSorting;

import java.util.*;

public class CountTripletsWithSumSmallerThanX {
	static class Solution {
		public long countTriplets(long arr[], int n,int sum) {
			// Arrays.sort(arr);
			
			// long result = 0;

			// for (int i = 0; i < n - 2; i++) {
			// 	for (int j = i + 1; j < n - 1; j++) {
			// 		for (int k = j + 1; k < n; k++) {
			// 			long firstNum = arr[i];
			// 			long secondNum = arr[j];
			// 			long thirdNum = arr[k];

			// 			if (firstNum + secondNum + thirdNum >= sum) {
			// 				result++;
			// 			}
			// 		}
			// 	}
			// }
			
			// return result;

			Arrays.sort(arr);

			long result = 0;

			for (int i = 0; i < n - 2; i++) {
				int left = i + 1;
				int right = n - 1;
				
				while (left < right) {
					if (arr[i] + arr[left] + arr[right] < sum) {
						result = result + (right - left);

						left++;
					} else {
						right--;
					}
				}
			}

			return result;
		}
	}
	
	public static void main(String[] args) {
		long[] arr = {-2, 0, 1, 3};
		int n = arr.length;
		int sum = 2;
		
		Solution solution = new Solution();
		System.out.println(solution.countTriplets(arr, n, sum));
	}

}
