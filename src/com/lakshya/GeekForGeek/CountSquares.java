package com.lakshya.GeekForGeek;

public class CountSquares {
    static class Solution {
        public int countSquares(int N) {
            int sqrt = (int) Math.sqrt(N);

            if (sqrt * sqrt == N) return sqrt - 1;
            else return sqrt;
        }
    }

    public static void main(String[] args) {
        int N = 9;

        Solution solution = new Solution();
        System.out.println(solution.countSquares(N));
    }
}
