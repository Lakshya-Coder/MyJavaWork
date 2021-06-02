package com.lakshya.Array_Question;

import java.util.*;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    static class Solution {
        public int[] minOperations(String boxes) {
//            int n = boxes.length();
//            
//            int[] result = new int[n];
//            
//            for (int i = 0; i < n; i++) {
//                int val = 0;
//                
//                for (int j = 0; j < n; j++) {
//                    char currChar = boxes.charAt(j);
//                    
//                    if (currChar == '1')
//                        val += Math.abs(i-j/* CALCULATING THE LENGTH OF ONE BOX TO ANOTHER BOX */);
//                }
//                
//                result[i] = val;
//            }
//             
//            return result;
        	
        	int n = boxes.length();
        	int right = 0;
        	int left = 0;

        	int steps = 0;
        	
        	int[] result = new int[n];
        	
        	for (int i = 0; i < n; i++) {
        		char currChar = boxes.charAt(i);

        		if (currChar == '1') {
                    steps += i;
        		    right++;
                }
        	}

        	for (int i = 0; i < n; i++) {
        	    result[i] = steps;

                char currChar = boxes.charAt(i);
        	    if (currChar == '1') {
        	        right--;
        	        left++;
                }

        	    steps += left;
        	    steps -= right; // because you are 1 step closure all of them
            }
        	
        	return result;
        }
    }

    public static void main(String[] args) {
        String boxes = "001011";
        
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.minOperations(boxes)));
    }
}
