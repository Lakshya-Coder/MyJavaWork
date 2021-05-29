package com.lakshya.Array_Question;

public class FindMissingAndRepeating {
    static class Solution {
        public int[] findTwoElement(int[] arr, int n) {
            int[] res = new int[] {-1, -1};

            if (arr == null || n == 0)
                return res;

            if (n == 1) {
                if (arr[0] == 1) {
                    res[0] = 1;
                    res[1] = 0;
                }

                return res;
            }

            int[] frequencies = new int[n + 1];

            for (int val : arr)
                frequencies[val]++;

            int a = 0;
            int b = 0;

            for (int i = 0; i <= n; i++) {
                int frequency = frequencies[i];
                if (frequency > 1) {
                    a = i;
                } else if (frequency == 0) {
                    b = i;
                }
            }

            res[0] = a;
            res[1] = b;

            return res;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3};
        int n = arr.length;

        Solution solution = new Solution();
        int[] res = solution.findTwoElement(arr, n);

        System.out.println(res[0] + " " + res[1]);
    }
}
