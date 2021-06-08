package com.lakshya.Array_Question;

import java.util.*;

public class FinalPricesWithaSpecialDiscountinaShop  {
	static class Solution {
			public int minimumElement(int[] prices, int i, int num) {
		        int n = prices.length;
		        
		        for (; i < n; i++) {
		            if (prices[i] <= num) {
		                return prices[i];
		            }
		        }
		        
		        return 0;
		    }
    
    	public int[] finalPrices(int[] prices) {
	        // int n = prices.length;
	        
	        // for (int i = 0; i < n; i++)
	        //     prices[i] = prices[i] - minimumElement(prices, i + 1, prices[i]);
	        
	        // return prices;
	        int n = prices.length;
	        Stack<Integer> stack = new Stack<>();

	        for (int i = 0; i < n; i++) {
	        	while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
	       			prices[stack.pop()] -= prices[i];
	        	}

	        	stack.add(i);
	        }

	        return prices;
	    }
	}

	public static void main(String[] args) {
		int[] prices = {8, 4, 6, 2, 3};

		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.finalPrices(prices)));
	}
}