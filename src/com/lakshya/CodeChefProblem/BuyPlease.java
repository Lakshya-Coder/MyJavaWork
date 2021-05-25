package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuyPlease {
    public static int totalPrice(int a, int b, int x, int y) {
        int costOfPen;
        int costOfPencils;

        costOfPen = a * x;
        costOfPencils = b * y;

        return costOfPen + costOfPencils;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        int x = Integer.parseInt(stringTokenizer.nextToken());
        int y = Integer.parseInt(stringTokenizer.nextToken());

        int result = totalPrice(a, b, x, y);
        System.out.println(result);
    }
}
