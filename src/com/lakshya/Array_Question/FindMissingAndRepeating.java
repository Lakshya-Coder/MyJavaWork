package com.lakshya.Array_Question;

public class FindMissingAndRepeating {
    static class Solution {
        public int[] findTwoElement(int[] arr, int n) {
            // This code crash when input arr contains negative number
            int a = -1;
            int b = -1;

            for (int i = 0; i < n; i++) { // 0 ... n - 1
                int curr = Math.abs(arr[i]);

                if (arr[curr - 1 /* 0 base indexing */] < 0) {
                    a = i + 1;
                } else {
                    arr[curr - 1] *= -1 ;
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0) {
                    b = i +  1;
                    break;
                }
            }

            int[] res = new int[] {-1, -1};

            res[0] = a;
            res[1] = b;

            return res;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 2};
        int n = arr.length;

        Solution solution = new Solution();
        int[] res = solution.findTwoElement(arr, n);

        System.out.println(res[0] + " " + res[1]);
    }
}
