package com.lakshya.BitManipulation;

import java.util.*;

public class RepeatedDNASequences {
    static class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            List<String> ans = new ArrayList<>();
            Map<String, Integer> map = new HashMap<>();
            int i = 0;
    
            while (i + 10 <= s.length()) {
                String subsequence = s.substring(i, i++ + 10);
                map.put(subsequence, map.getOrDefault(subsequence, 0) + 1);
    
                if (map.get(subsequence) == 2) {
                    ans.add(subsequence);
                }
            }
    
            return ans;
        }
    }

    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Solution solution = new Solution();

        System.out.println(solution.findRepeatedDnaSequences(s));
    }
}
