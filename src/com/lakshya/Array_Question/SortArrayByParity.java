package com.lakshya.Array_Question;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };

        String answer = Arrays.toString(Solution.sortArrayByParity(arr));
        System.out.println(answer);
    }

    static class Solution {
        public static int[] sortArrayByParity(int[] nums) {
//			int n = nums.length;
//			Integer[] arr = new Integer[n];
//
//			int idx = 0;
//			for (int val : nums)
//				arr[idx++] = val;
//
//			Arrays.sort(arr, (a, b) -> Integer.compare(a % 2, b % 2));
//
//			for (int i = 0; i < n; i++)
//				nums[i] = arr[i];
//
//			return nums;

            int n = nums.length;
            int[] ans = new int[n];

            int idx = 0;

            for (int i = 0; i < n; i++)
                if (nums[i] % 2 == 0)
                    ans[idx++] = nums[i];

            for (int i = 0; i < n; i++)
                if (nums[i] % 2 != 0)
                    ans[idx++] = nums[i];

            return ans;
        }
    }

}
