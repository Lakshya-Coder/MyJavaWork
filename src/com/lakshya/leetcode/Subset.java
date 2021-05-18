package com.lakshya.leetcode;

import java.io.*;
import java.util.*;

public class Subset {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());

            int[] nums = new int[n];

            stringTokenizer = new StringTokenizer(reader.readLine());

            for (int i = 0; i < n; i++) nums[i] = Integer.parseInt(stringTokenizer.nextToken());

            Solution solution = new Solution();
            System.out.println(solution.subsets(nums));
        }
    }

    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            // List<List<Integer>> answer = new ArrayList<>();
            // answer.add(new ArrayList<>()); // answer -> [[]]

            // for (int num : nums) {
            //     List<List<Integer>> new_subset = new ArrayList<>();

            //     for (List<Integer> curr : answer) {
            //         new_subset.add(new ArrayList<Integer>(curr){{add(num);}}); // [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
            //     }

            //     for (List<Integer> curr : new_subset)
            //         answer.add(curr);
            // }

            // return answer;

            List<List<Integer>> subsets = new ArrayList<>();
            generateSubsets(0, nums, new ArrayList<Integer>(), subsets);

            return subsets;
        }

        public void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> subsets) {
            subsets.add(new ArrayList<>(current)); // We do not want to add current because we modify the current so we add copy of current

            for (int i = index; i < nums.length; i++) {
                current.add(nums[i]); // We take this nums[i]
                generateSubsets(i + 1, nums, current, subsets);
                current.remove(current.size() - 1); // We want to remove last digit and this is also backtracking
            }
        }
    }
}
