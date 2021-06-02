package com.lakshya.Array_Question;

public class NumberOfGoodPairs {
    static class Solution {
        public int numIdenticalPairs(int[] nums) {
//         int cnt = 0;

//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] == nums[j]) {
//                     cnt++;
//                 }
//             }
//         }

//         return cnt;

             int result = 0;
             int[] count = new int[101];

             for (int num : nums) {
                 result += count[num]++;
             }

             return result;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};

        Solution solution = new Solution();
        System.out.println(solution.numIdenticalPairs(nums));
    }
}
