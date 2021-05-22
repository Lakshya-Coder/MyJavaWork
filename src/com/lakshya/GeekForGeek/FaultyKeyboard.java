package com.lakshya.GeekForGeek;

public class FaultyKeyboard {
    public static void main(String[] args) {
        System.out.println(Solution.maxNatural(100));
    }

    static class Solution {
        public static int maxNatural(int m) {
            int number = 9;
            int digit = 1; // The length of the number

            while (m > number * digit) {
                m = m - (number * digit);

                digit++;
                number *= 10;
            }

            int ans = (number) / 9 - 1; // Finding the complete number
            ans += (m / digit); // Finding the left numbers

            return ans;
        }
    }
}
