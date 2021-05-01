package com.lakshya.String;

public class MaximumNestingDeptOfParentheses {
    public static int maxDepth(String str) {
        // str == "" string is empty
        if (str == null)
            return -1;

        int n = str.length();

        if (n == 0)
            return 0;
        else if (n == 1) {
            boolean isOpenParentheses = str.charAt(0) == '(';
            if (isOpenParentheses)
                return 1;
            else
                return 0;
        }

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
