package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GradeTheSteel {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int testCase = Integer.parseInt(stringTokenizer.nextToken());

        while (testCase-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            int h = Integer.parseInt(stringTokenizer.nextToken());
            float c = Float.parseFloat(stringTokenizer.nextToken());
            int t = Integer.parseInt(stringTokenizer.nextToken());

            int grade = gradeTheSteel(h, c, t);
            System.out.println(grade);
        }
    }

    private static int gradeTheSteel(int h, float c, int t) {
        int grade;

        if (h > 50 && c < 0.7 && t > 5600) {
            grade = 10;
        } else if (h > 50 && c < 0.7) {
            grade = 9;
        } else if (c < 0.7 && t > 5600) {
            grade = 8;
        } else if (h > 50 && t > 5600) {
            grade = 7;
        } else if (h > 50 || c < 0.7 || t > 5600) {
            grade = 6;
        } else {
            grade = 5;
        }

        return grade;
    }
}
