package com.lakshya.String;

import java.util.ArrayList;

public class SumOfUpperAndLowerTriangle {

    /*

       Upper triangle:

        * * *
          * *
            *

       Lower triangle:

       *
       * *
       * * *

    */

    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int upperTriangleSum = 0;
        int lowerTriangleSum = 0;

        // Upper triangle
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                upperTriangleSum += matrix[i][j];
            }
        }

        // Lower triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                lowerTriangleSum += matrix[i][j];
            }
        }

        arrayList.add(upperTriangleSum);
        arrayList.add(lowerTriangleSum);

        return arrayList;
    }


    public static void main(String[] args) {
        int[][] mat = {{6, 5, 4},
                {1, 2, 5},
                {7, 9, 7}};

        System.out.println(sumTriangles(mat, mat.length));
    }

}
