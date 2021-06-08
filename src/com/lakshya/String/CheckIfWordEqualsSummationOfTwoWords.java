package com.lakshya.String;

public class CheckIfWordEqualsSummationOfTwoWords {
	static class Solution {
	    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
	    	return getIntValue(firstWord) + getIntValue(secondWord) == getIntValue(targetWord);
		}

		private int getIntValue(String str) {
			int result = 0;

			for (int i = 0; i < str.length(); i++) {
				result = (result * 10) + (str.charAt(i) - 'a');
			}

			return result;
		}
	}

	public static void main(String[] args) {
		/*
			firstWord = "acb", secondWord = "cba", targetWord = "cdb"
		*/

		String firstWord = "acb";
		String secondWord = "cba";
		String targetWord = "cdb";

		Solution solution = new Solution();
		System.out.println(solution.isSumEqual(firstWord, secondWord, targetWord));
	}
}