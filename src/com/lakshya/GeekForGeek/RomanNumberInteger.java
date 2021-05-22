package com.lakshya.GeekForGeek;

public class RomanNumberInteger {
    static class Solution {
        public int value(char c) {
            if (c == 'I') {
                return 1;
            } else if (c == 'V') {
                return 5;
            } else if (c == 'X') {
                return 10;
            } else if (c == 'L') {
                return 50;
            } else if (c == 'C') {
                return 100;
            } else if (c == 'D') {
                return 500;
            } else {
                return 1000;
            }
        }

        public int romanToDecimal(String str) {
            int n = str.length();
            int result = 0;

            for (int i = 0; i < n; i++) {
                int s1 = value(str.charAt(i));

                if (i + 1 < n) {
                    int s2 = value(str.charAt(i + 1));

                    if (s1 >= s2) {
                        result = result + s1;
                    } else {
                        result = result + s2 - s1;
                        i++;
                    }
                } else {
                    result = result + s1;
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String str = "CMXVI";

        System.out.println(solution.romanToDecimal(str));
    }
}
