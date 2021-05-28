package com.lakshya.CodeChefProblem;

import java.io.*;
import java.util.*;

public class ValidTriangleOrNot {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}