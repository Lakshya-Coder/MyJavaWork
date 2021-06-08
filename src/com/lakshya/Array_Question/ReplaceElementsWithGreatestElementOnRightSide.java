package com.lakshya.Array_Question;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
	static class Solution {
		public int[] replaceElements(int[] arr) {
	        // int n = arr.length;
	        
	        // for (int i = 0; i < n; i++) {
	        //     int max = -1;
	            
	        //     for (int j = i + 1; j < n; j++) {
	        //         max = Math.max(max, arr[j]);
	        //     }
	            
	        //     arr[i] = max;
	        // }
	        
	        // return arr;
	        int n = arr.length;
	        int max = -1;

	        for (int i = n - 1; i >= 0; i--) {
	        	int temp = arr[i];
	        	arr[i] = max;
	        	max = Math.max(max, temp);
	        }

	        return arr;
	    }
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};

		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.replaceElements(arr)));
	}
}