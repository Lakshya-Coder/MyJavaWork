package com.lakshya.String;

import java.util.Scanner;
import java.util.Stack;

public class RedundantParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        sc.close();

        Stack<Character> stack = new Stack<>();

        boolean answer = false;
        for (char c : string.toCharArray()) {
            if (c == '(') {
                stack.add(c);
            } else if (c == '+' || c == '-' || c  == '*' || c == '/')
                stack.add(c);
            else if (!stack.isEmpty() && c == ')') {
                if (stack.peek() == '(') {
                    answer = true;
                }
                while (stack.peek() == '+' || stack.peek() == '-'
                        || stack.peek() == '*' || stack.peek() == '/') {
                    stack.pop();
                }

                stack.pop();
            }
        }

        System.out.println(answer);
    }
}
