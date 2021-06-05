package com.lakshya.Array_Question;

public class FlippingAnImage {
    public static class Solution {
        public void swap(int[] arr, int i, int j) {
           int temp = arr[i];

           arr[i] = arr[j];
           arr[j] = temp;
        }

        public void reverse(int[] arr) {
            int n = arr.length;

            int i = 0;
            int j = n - 1;

            while (i < j) {
                swap(arr, i++, j--);
            }
        }

        public void invert(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n; i++) 
                if (arr[i] == 0)
                    arr[i] = 1;
                else
                    arr[i] = 0;
        }

        public int[][] flipAndInvertImage(int[][] image) {
           for (int[] arr : image) {
                reverse(arr);
           }

           for (int[] arr : image) {
                invert(arr);
           }

           return image;
        }
    }

    public static void printMat(int[][] mat) {
        for (int[] arr : mat) 
            System.out.println(java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        Solution solution = new Solution();
        printMat(solution.flipAndInvertImage(image));
    }
}
