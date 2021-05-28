package com.lakshya.GeekForGeek;

public class MiddleOfThree {
    static class Solution {
        public int middle(int a, int b, int c){
            if (b > c) {
                if (a > b) {
                    return b;
                } else {
                    return Math.max(a, c);
                }
            }

            if (c > a) {
                return Math.max(a, b);
            }

            return a;
        }
    }

    public static void main(String[] args) {
        int A = 978, B = 518, C = 300;

        Solution solution = new Solution();

        System.out.println(solution.middle(A,B ,C));
    }
}
