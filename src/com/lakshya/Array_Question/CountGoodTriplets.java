package com.lakshya.Array_Question;

public class CountGoodTriplets {
    static class Solution {
        public int countGoodTriplets(int[] arr, int a, int b, int c) {
            int cnt = 0;
            
            int n = arr.length;
            for (int i = 0; i < n - 2/* Triplets is exist */; i++)
                for (int j = i + 1; j < n; j++)
                    if (Math.abs(arr[i] - arr[j]) <= a)
                        for (int k = j + 1; k < n; k++)
                            if (Math.abs(arr[j] - arr[k]) <= b
                           && Math.abs(arr[i] - arr[k]) <= c) {
                                cnt++;
                            }
            return cnt; 
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,0,1,1,9,7};

        int a = 7;
        int b = 2;
        int c = 3;

        Solution solution = new Solution();
        System.out.println(solution.countGoodTriplets(arr, a, b, c));
    }
}
