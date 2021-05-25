package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FactorsFinding {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());

        int count = 0;

        boolean[] factors = new boolean[n + 1];

        Arrays.fill(factors, false);

        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                factors[i] = true;
                count++;
            }
        }

        System.out.println(count);

        for (int i = 1; i < n + 1; i++) {
            if (factors[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
