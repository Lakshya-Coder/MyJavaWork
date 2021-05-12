package com.lakshya.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();

        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        Stack<Character> stack = new Stack<>();

        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();

                if (map.get(c) != topElement) {
                    return false;
                }

            } else { // It was opening bracket
                stack.add(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }
}
