package com.lakshya.Array_Question;

import java.util.*;

public class ValueEqualToIndexValue {
    static class Solution {
        public ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
            ArrayList<Integer> res = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (arr[i - 1] == i) {
                    res.add(i);
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {15, 2, 45, 12, 7};
        System.out.println(solution.valueEqualToIndex(arr, arr.length));
    }
}
