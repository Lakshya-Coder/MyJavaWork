package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AddTwoNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(a + b);
        }
    }
}
