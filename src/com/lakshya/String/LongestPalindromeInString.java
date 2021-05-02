package com.lakshya.String;

public class LongestPalindromeInString {
    public static String longestPalin(String s) {
        // Base Case
        if (s == null || s.length() == 0) {
            return "";
        }

        int len = s.length();
        int start = 0;
        int maxLength = 1;
        int low, high;

        for (int i = 1; i < len; i++) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < len &&
                s.charAt(low) == s.charAt(high)) {
                int currentLength = high - low + 1;
                if (currentLength > maxLength) {
                    start = low;
                    maxLength = currentLength;
                }

                low--;
                high++;
            }

            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len &&
                    s.charAt(low) == s.charAt(high)) {
                int currentLength = high - low + 1;
                if (currentLength > maxLength) {
                    start = low;
                    maxLength = currentLength;
                }

                low--;
                high++;
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        System.out.println(longestPalin("aaaabbbaa"));
    }

}
