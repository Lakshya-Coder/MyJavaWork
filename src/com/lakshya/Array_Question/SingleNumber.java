package com.lakshya.Array_Question;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        Solution solution = new Solution();
        System.out.println(solution.singleNumber(nums));
    }

    static class Solution {
        public int singleNumber(int[] nums) {
            int ans = 0;

            for (int num : nums) ans ^= num;

            return ans;
        }
    }
}
