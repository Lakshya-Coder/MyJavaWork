package com.lakshya.Array_Question;

import java.util.Arrays;

public class FindPairGivenDifference {
    static class Solution {
        public boolean findPair(int[] arr, int len, int n) {
            Arrays.sort(arr);

            int i = 0;
            int j = 1;

            while (i < len && j < len) {
                if (i != j && arr[j] - arr[i] == n) {
                    return true;
                } else if (arr[j] - arr[i] < n) {
                    j++;
                } else {
                    i++;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {

    }
}
