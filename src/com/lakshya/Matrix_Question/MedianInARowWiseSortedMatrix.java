// Problem link: https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1
package com.lakshya.Matrix_Question;

import java.util.Arrays;

public class MedianInARowWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2, 3}};
        int r = matrix.length; // Row
        int c = matrix[0].length; // Column

        System.out.println(median(matrix, r, c));
    }

    public static int median(int[][] matrix, int r, int c) {
        /*
        * First we find minimum to maximum elements in matrix, because matrix is row-wise sorted
        * so it is easy to find.
        * Minimum = by comparing first element of each row
        * Maximum = by comparing last element of each row
        *
        * Binary Search on our range of numbers from minimum to maximum
        * Minimum = 2 and Maximum = 8 => 2, 3, 4, 5, 6, 7, 8
        *
        * Find the mid of the min and max
        * And get count numbers (in the matrix) less than our mid. And accordingly
        * change the min or max
        * if (count < (r*c)/2):
        *   min = mid + 1 // the median must be greater than selected number
        * else:
        *   max = mid // the median must be less than or equal to the selected number */

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < r; i++) {
            // Finding the minimum element
            min = Math.min(min, matrix[i][0]);

            // Finding the maximum element
            max = Math.max(max, matrix[i][c - 1]);
        }

        int desired = (r * c + 1) / 2; /* Median is smaller than half of the matrix
         and greater than half matrix */

        while (min < max) {
            int mid = min + (max - min) / 2;
            int place = 0; // number of elements in a matrix
            int get = 0;

            for (int i = 0; i < r; i++) {
                get = Arrays.binarySearch(matrix[i], mid);

                // If mid is not fond so binarySearch() function returns: (-(insertion_point)  - 1)
                if (get < 0) {
                    get = Math.abs(get) - 1;
                } else {
                    // We implement upperBound() which is in c++
                    while (get < matrix[i].length && matrix[i][get] == mid) {
                        get++;
                    }
                }
                place += get;
            }

            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }

        return min;
    }
}
