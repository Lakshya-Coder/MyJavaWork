package com.lakshya.Array_Question;

import java.util.Arrays;

public class ShuffleTheArray {
    static class Solution {
        public int[] shuffle(int[] nums, int n) {
//         int len = nums.length;

//         Queue<Integer> x = new LinkedList<>();
//         Queue<Integer> y = new LinkedList<>();

//         for (int i = 0; i < n; i++) {
//             x.add(nums[i]);
//         }

//         for (int i = n; i < len; i++) {
//             y.add(nums[i]);
//         }

//         for (int i = 0; i < len; i++) {
//             int val;


//             if (i % 2 == 0) {
//                 val = x.poll();
//             } else {
//                 val = y.poll();
//             }

//             nums[i] = val;
//         }

//         return nums;

            int len = nums.length;
            int[] result = new int[len];

            int y = n;

//         for (int i = 0; i < len; i++) {
//             int val;

//             if (i % 2 == 0) {
//                 val = nums[x++];
//             } else {
//                 val = nums[y++];
//             }

//             result[i] = val;
//         }

//         return result;

            int idx = 0;

            for (int i = 0; i < n; i++) {
                int val;

                val = nums[i];
                result[idx++] = val;

                val = nums[y++];
                result[idx++] = val;
            }

            return result;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.shuffle(nums, n)));
    }
}
