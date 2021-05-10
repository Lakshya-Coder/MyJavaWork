package com.lakshya.Matrix_Question;

import java.util.ArrayList;

public class SnakePattern {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> result = new ArrayList<>();

        boolean leftToRight = true;
        boolean rightToLeft = false;

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            if (leftToRight) {
                for (int j = 0; j < n; j++) {
                    result.add(matrix[i][j]);
                }

                rightToLeft = true;
                leftToRight = false;
            } else if (rightToLeft) {
                for (int j = n - 1; j >= 0; j--) {
                    result.add(matrix[i][j]);
                }

                leftToRight = true;
                rightToLeft = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int mat[][] = {{45, 48, 54},
                {21, 89, 87},
                {70, 78, 15}};

        System.out.println(snakePattern(mat));
    }
}
