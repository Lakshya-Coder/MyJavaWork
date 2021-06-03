package com.lakshya.Array_Question;

import java.util.*;

public class QueriesOnAPermutationWithKey {
    static class Solution {
        public int findVal(int[] P, int key) { // Time complixty: O(n) and Space complixty: O(1)
            int n = P.length;
            for (int i = 0; i < n; i++) {
                int curr = P[i];

                if (curr == key)
                    return i;
            }

            return -1;
        }

        public void swap(int[] P, int i, int j) {
            int temp = P[i];
            P[i] = P[j];
            P[j] = temp;
        }

        public void rotate(int[] P, int idx) {
            for (int i = 0; i < idx; i++) {
                swap(P, i, idx);
            }
        }

        public int[] processQueries(int[] queries, int m) {
            int[] P = new int[m];

            for (int i = 0; i < m; i++) {
                P[i] = i + 1;
            }

            int n = queries.length;
            int[] result = new int[n];

            int j = 0; // This is the index of result
            for (int i = 0; i < n; i++) {
                int key = queries[i];
                int idx = findVal(P, key);

                if (idx != -1) {
                    result[j++] = idx;
                    rotate(P, idx);
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        int[] queries = {3, 1, 2, 1};
        int m = 5;

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.processQueries(queries, m)));
    }
}
