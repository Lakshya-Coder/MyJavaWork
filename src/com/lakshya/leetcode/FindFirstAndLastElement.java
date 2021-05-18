package com.lakshya.leetcode;

import java.io.*;
import java.util.StringTokenizer;

public class FindFirstAndLastElement {
    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            // int[] result = new int[] {-1, -1};

            // int n = nums.length;
            // for (int i = 0; i < n; i++) {
            //     if (result[0] != -1) {
            //         if (nums[i] == target) result[1] = i;
            //     } else if (nums[i] == target) result[0] = i;
            // }

            // return result;

            int[] result = new int[] {-1, -1};
            if (nums.length == 0) {
                return result;
            }

            int start = 0;
            int end = nums.length - 1;

            while (start < end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] >= target) // Target is not present in right half we need to move in left half
                    end = mid;
                else
                    start = mid + 1;
            }

            if (nums[start] != target)
                return result;

            result[0] = start;

            end = nums.length;

            while (start < end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] > target) // Target is not present in right half we need to move in left half
                    end = mid;
                else
                    start = mid + 1;
            }

            result[1] = start - 1;

            return result;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        int[] nums = new int[n];
        int target = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) nums[i] = Integer.parseInt(stringTokenizer.nextToken());

        Solution solution = new Solution();
        int[] answer = solution.searchRange(nums, target);

        System.out.println(answer[0] + " " + answer[1]);
    }
}
