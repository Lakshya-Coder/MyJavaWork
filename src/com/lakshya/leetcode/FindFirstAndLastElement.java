package com.lakshya.leetcode;

public class FindFirstAndLastElement {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] result = new int[2];
            
            result[0] = findStartingIndex(nums, target);
            result[1] = findEndingIndex(nums, target);

            return result;
        }

        private int findStartingIndex(int[] nums, int target) {
            int index = -1;

            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {
                int midPoint = start + (end - start) / 2;
                int currNum = nums[midPoint];

                if (currNum >= target) {
                    end = midPoint - 1;
                } else {
                    start = midPoint + 1;
                }

                if (currNum == target) {
                    index = midPoint;
                    break;
                }
            }

            return index;
        }

        private int findEndingIndex(int[] nums, int target) {
            int index = -1;

            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {
                int midPoint = start + (end - start) / 2;
                int currNum = nums[midPoint];

                if (currNum >= target) {
                    start = midPoint + 1;
                } else {
                    end = midPoint - 1;
                }

                if (currNum == target) {
                    index = midPoint;
                    break;
                }
            }
            
            return index;
        }
    }
}
