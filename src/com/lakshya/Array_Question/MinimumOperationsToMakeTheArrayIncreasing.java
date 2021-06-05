package com.lakshya.Array_Question;

public class MinimumOperationsToMakeTheArrayIncreasing {
    static class Solution {
        public int minOperations(int[] nums) {
            int n = nums.length;
            int steps = 0;

            for (int i = 0; i + 1 < n; i++) {
                if (nums[i] >= nums[i + 1]) {
                    int diff = nums[i] - nums[i + 1];

                    steps += diff + 1;
                    nums[i + 1] = nums[i] + 1;
                }
            }

            return steps;
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 1};

        Solution solution = new Solution();
        System.out.println(solution.minOperations(nums));
    }
}
