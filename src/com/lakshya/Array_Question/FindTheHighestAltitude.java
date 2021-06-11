package com.lakshya.Array_Question;

public class FindTheHighestAltitude {
    static class Solution {
        public int largestAltitude(int[] gain) {
            int result = 0;

            int n = gain.length;
            for (int i = 1; i < n; i++) {
                gain[i] += gain[i - 1];
            }

            for (int val : gain) {
                result = Math.max(result, val);
            }

            return result;
        }
    }

    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};

        Solution solution = new Solution();
        System.out.println(solution.largestAltitude(gain));
    }
}
