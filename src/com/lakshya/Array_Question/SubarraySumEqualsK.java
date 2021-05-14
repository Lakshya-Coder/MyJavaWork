package com.lakshya.Array_Question;

import java.util.*;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        Solution solution = new Solution();
        int res = solution.subarraySum(nums, k);

        System.out.println(res);
    }

    static class Solution {
        public int subarraySum(int[] nums, int k) {
            int n = nums.length;

            int count = 0;
            Map<Integer, Integer> prev_sum = new HashMap<>();
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += nums[i];

                if (sum == k) {
                    count++;
                }

                if (prev_sum.containsKey(sum - k)) {
                    count += prev_sum.get(sum - k);
                }

                if (prev_sum.containsKey(sum))
                    prev_sum.put(sum, prev_sum.get(sum) + 1);
                else
                    prev_sum.put(sum, 1);
            }

            return count;
        }
    }
}
