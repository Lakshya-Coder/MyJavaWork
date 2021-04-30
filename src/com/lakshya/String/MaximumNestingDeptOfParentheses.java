package com.lakshya.String;

import java.util.Stack;

public class MaximumNestingDeptOfParentheses {
    public static int maxDepth(String str) {
        int n = str.length();

        int count = 0; // Take care of all parentheses in string
        int max_val = 0; // This is the result variable

        for (int i = 0; i < n; i++) {
            char curr = str.charAt(i);

            if (curr == '(') {
                count++;
                max_val = Math.max(max_val, count);
            } else if (curr == ')') {
                count--;
            }
        }

        return max_val;
    }

    public static void main(String[] args) {
        String str = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(str));
    }
}
