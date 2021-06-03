package com.lakshya.Array_Question;

import java.util.*;

public class DecompressRun_LengthEncodedList {
    static class Solution {
        public int[] fetchData(ArrayList<Integer> al) {
            int n = al.size();
            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                result[i] = al.get(i);
            }

            return result;
        }

        public int[] decompressRLElist(int[] nums) {
            int n = nums.length;
            ArrayList<Integer> al = new ArrayList<>(n);

            for (int i = 0; i + 1 < n; i += 2) {
                int freq = nums[i];
                int val = nums[i + 1];

                for (int j = 1; j <= freq; j++) {
                    al.add(val);
                }
            }

            int[] result = fetchData(al);

            return result;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.decompressRLElist(nums)));
    }
}
