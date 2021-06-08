package com.lakshya.String;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
	static class Solution {
		public int minPartitions(String n) {
		    int max = Integer.MIN_VALUE;
		    
		    int len = n.length();
		    for (int i = 0; i < len; i++) {
		        int currInt = n.charAt(i) - '0';

		        if (max < currInt)
		        	max = currInt;
		    }

		    return max;
		}
	}

	public static void main(String[] args) {
		String n = "32";

		Solution solution = new Solution();
		System.out.println(solution.minPartitions(n));
	}
}