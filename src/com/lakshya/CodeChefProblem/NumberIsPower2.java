package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberIsPower2 {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            int num = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println((num & num - 1) == 0 ? "This is the power of 2" : "This is the not power of 2");
        }
    }
}
