package com.lakshya.String;

import java.util.Arrays;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    static int[] freq = new int[26];

    public static int minSteps(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        return Arrays.stream(freq).map(Math::abs).sum() / 2;
//        int ans = 0;
//        for (int val : freq) {
//            int abs_val = Math.abs(val);
//            ans += abs_val;
//        }
//
//        return ans / 2;
    }

    public static void main(String[] args) {
        int ans = minSteps("leetcode", "practice");
        System.out.println(ans);
    }
}
