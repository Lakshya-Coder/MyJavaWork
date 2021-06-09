package com.lakshya.Array_Question;

public class FindTheDifference {
    static class Solution {
        public char findTheDifference(String s, String t) {
            // for (int i = 0; i < s.length(); i++) {
            //     t = t.replaceFirst(String.valueOf(s.charAt(i)), "");
            // }

            // return t.length() == 1 ? t.charAt(0) : '\0';

            int[] count = new int[26];
            for (int i = 0; i < t.length(); i++) {
                count[t.charAt(i) - 'a']++;
            }

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']--;
            }

            for (int i = 0; i < t.length(); i++) {
                if (count[t.charAt(i) - 'a'] > 0) {
                    return t.charAt(i); 
                }
            }

            return '\0';
        }
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        Solution solution = new Solution();
        System.out.println(solution.findTheDifference(s, t));
    }
}
