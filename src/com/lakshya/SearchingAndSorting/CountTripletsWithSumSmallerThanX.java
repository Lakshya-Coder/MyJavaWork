package com.lakshya.SearchingAndSorting;

import java.util.*;

public class CountTripletsWithSumSmallerThanX {
	static class Solution {
		public long countTriplets(long arr[], int n,int sum) {
			Arrays.sort(arr);
			
			long result = 0;
			
			for (int i = 0; i < n - 2; i++) {
				System.out.println(i);
				for (int j = i + 1; j < n - 1; j++) {
					long firstElement = arr[i];
					long secondElement = arr[j];
					
					int idx = 0;
					long[] temp = new long[n - j - 1];
					for (int k = j + 1; k < n; k++) {
						temp[idx++] = arr[k];
					}
					
					System.out.println(Arrays.toString(temp));
					long key = (firstElement + secondElement) - sum;
					
					if (Arrays.binarySearch(temp, key) != -1) {
						result++;
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
