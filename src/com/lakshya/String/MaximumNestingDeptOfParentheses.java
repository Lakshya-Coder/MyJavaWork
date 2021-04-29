package com.lakshya.String;

import java.util.Stack;

public class MaximumNestingDeptOfParentheses {
    public static int maxDepth(String str) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        // write code here
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.add(c);
                System.out.println(":D");
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    count++;
                }
            }
        }

        System.out.println(stack);

        return count;
    }

    public static void main(String[] args) {
        String str = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(str));
    }
}
