package com.lakshya.Array_Question;

public class SearchInRotatedSortedArray {
    static class Solution {
        public int search(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return -1;
            }

            int n = nums.length;

            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2; // (left + right) / 2

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] >= nums[left]) {
                    if (target <= nums[mid] && target >= nums[left]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (target >= nums[mid] && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        Solution solution = new Solution();
        System.out.println(solution.search(nums, 0));
    }
}
