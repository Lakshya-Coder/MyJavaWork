package com.lakshya.leetcode;

import java.util.ArrayList;

public class FindTheTownJudge {
    static class Solution {
        /**
         *
         * If the town judge exists, then:
         *
         * 1) The town judge trusts nobody.
         * 2) Everybody (except for the town judge) trusts the town judge.
         * 3) There is exactly one person that satisfies properties 1 and 2.
         *
         * */

        public int findJudge(int n, int[][] trust) {
            int[] followers = new int[n + 1];
            int[] does_follow = new int[n + 1];

            for (int[] pair : trust) {
                int a = pair[0];
                int b = pair[1];

                // Person a trusts Person b
                followers[b]++;
                does_follow[a] = 1;
            }

            ArrayList<Integer> final_candidate = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (followers[i] == n - 1 && does_follow[i] == 0) {
                    final_candidate.add(i);
                }
            }

            if (final_candidate.size() != 1) return -1;
            return final_candidate.get(0);
        }
    }

    public static void main(String[] args) {
        int[][] trusts = {{1,2}};
        int n = 2;

        Solution solution = new Solution();
        System.out.println(solution.findJudge(n, trusts));
    }
}
