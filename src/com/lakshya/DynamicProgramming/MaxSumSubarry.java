// Problem link: https://leetcode.com/problems/maximum-subarray/
package com.lakshya.DynamicProgramming;

public class MaxSumSubarry {

    // O(N), O(1)
    public static int maxSubArray(int[] nums) {
        int n = nums.length;

        long ans = Integer.MIN_VALUE;

        long prevMax = Integer.MIN_VALUE, curMax;

        for (int i = 0; i < n; i++) {
            curMax = nums[i];
            curMax = Math.max(curMax, nums[i] + prevMax);

            ans = Math.max(ans, curMax);
            prevMax = curMax;
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans = maxSubArray(nums);

        System.out.println(ans);
    }

}
