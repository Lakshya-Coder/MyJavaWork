package com.lakshya.leetcode;

import java.io.*;
import java.util.*;

public class GenerateParenthesis {
    static class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> list = new ArrayList<>();
            backtrack(list, new StringBuilder(), 0, 0, n);
            return list;
        }

        public void backtrack(List<String> res, StringBuilder curr, int open, int close, int max) {
            if (curr.length() == max * 2) {
                res.add(curr.toString());
                return;
            }

            if (open < max) {
                curr.append('(');
                backtrack(res, curr, open + 1, close, max);
                curr.deleteCharAt(curr.length() - 1); // This is backtracking or undo
            }

            if (close < open) {
                curr.append(')');
                backtrack(res, curr, open, close + 1, max);
                curr.deleteCharAt(curr.length() - 1); // This is backtracking or undo
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(stringTokenizer.nextToken());

        Solution solution = new Solution();
        
        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(solution.generateParenthesis(n));
        }
    }
}
