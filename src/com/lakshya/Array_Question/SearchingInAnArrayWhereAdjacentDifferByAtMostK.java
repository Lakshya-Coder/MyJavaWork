package com.lakshya.Array_Question;

public class SearchingInAnArrayWhereAdjacentDifferByAtMostK {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 6};
        int n = arr.length;

        int k = 1;
        int x = 6;

        int ans = -1;
        int i = 0;

        while (i < n) {
            if (arr[i] == x) {
                ans = i;
                break;
            }

            i = i + Math.max(1, Math.abs(arr[i] - x) / k);
        }

        System.out.println(ans);
    }
}
