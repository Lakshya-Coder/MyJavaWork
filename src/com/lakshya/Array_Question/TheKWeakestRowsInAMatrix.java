package com.lakshya.Array_Question;

import java.util.*;

public class TheKWeakestRowsInAMatrix {
    static class Pair {
        int sum;
        int i;

        public Pair(int sum, int i) {
            this.sum = sum;
            this.i = i;
        }

        public Pair() {}
    }

    static class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
            int n = mat.length;
            Pair[] rows_strenght = new Pair[n];

            for (int i = 0; i < n; i++) {
                var rows = mat[i];
                var sum = 0;

                rows_strenght[i] = new Pair(sum, i);
            }

            Arrays.sort(rows_strenght);
            return mat[0];
        }
    }

    public static void main(String[] args) {
        int[][] mat = {};
    }
}
