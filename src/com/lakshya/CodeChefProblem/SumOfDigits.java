package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfDigits {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            String number = stringTokenizer.nextToken();

            int sum = 0;

            int n = number.length();
            for (int i = 0; i < n; i++) {
                sum += Integer.parseInt(String.valueOf(number.charAt(i)));
            }

            System.out.println(sum);
        }
    }
}
