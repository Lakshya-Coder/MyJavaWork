package com.lakshya.Array_Question;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {
    static class Solution {
        long firstIndex(long[] arr, int n, int x) {
            int low = 0;
            int high = n - 1;

            long index = (long) -1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (x > arr[mid]) {
                    low = mid + 1;
                } else if (x < arr[mid]) {
                    high = mid - 1;
                } else {
                    index = (long) mid;
                    high = mid - 1;
                }
            }

            return index;
        }

        long lastIndex(long[] arr, int n, int x) {
            int low = 0;
            int high = n - 1;

            long index = (long) -1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (x > arr[mid]) {
                    low = mid + 1;
                } else if (x < arr[mid]) {
                    high = mid - 1;
                } else {
                    index = (long) mid;
                    low = mid + 1;
                }
            }

            return index;
        }

        ArrayList<Long> find(long arr[], int n, int x) {
            if (arr == null || n == 0) {
                return null;
            }

            ArrayList<Long> result = new ArrayList<Long>();

            result.add(firstIndex(arr, n, x));
            result.add(lastIndex(arr, n, x));

            return result;
        }
    }

    public static void main(String[] args) {
        long arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };

        Solution solution = new Solution();
        System.out.println(solution.find(arr, arr.length, 5));
    }
}
