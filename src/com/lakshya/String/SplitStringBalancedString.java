package com.lakshya.String;

public class SplitStringBalancedString {
    public static int balancedStringSplit(String str) {
        int balancedCount = 0;
        int count = 0;

        for (char c : str.toCharArray()) {
            // We have two possible cases
            // L or R
            if (c == 'L') {
                count++;
            } else if (c == 'R') {
                count--;
            }

            boolean countIsZero = count == 0;
            if (countIsZero) {
                balancedCount++;
            }
        }

        return balancedCount;
    }

    public static void main(String[] args) {
        String str = "RLRRLLRLRL";

        System.out.println("This is output: " + balancedStringSplit(str));
    }
}
