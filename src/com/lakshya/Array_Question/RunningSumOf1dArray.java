package com.lakshya.Array_Question;

import java.util.Arrays;

public class RunningSumOf1dArray {
    static class Solution {
        public int[] runningSum(int[] nums) {
            int n = nums.length;

            for (int i = 1; i < n; i++) {
                nums[i] += nums[i - 1];
            }

            return nums;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.runningSum(nums)));
    }
}
