package com.lakshya.Array_Question;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 2, 0};
        int n = nums.length;

        sort012(nums, n);
        String array = Arrays.toString(nums);

        System.out.println(array);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sort012(int a[], int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    swap(a, low++, mid++);
                    break;
                case 2:
                    swap(a, mid, high--);
                    break;
                case 1:
                    mid++;
            }
        }
    }
}
