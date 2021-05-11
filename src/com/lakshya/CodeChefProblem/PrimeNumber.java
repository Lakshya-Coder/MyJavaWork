package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PrimeNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());

//        for (int i = 2; i <= n; i++) {
//            int x = i;
//
//            int count = 0;
//            for (int j = 1; j <= x; j++) {
//                if (x % j == 0) {
//                    count++;
//                }
//            }
//
//            if (count == 2) {
//                System.out.println(x);
//            }
//        }

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int p = 2; p * p <= n; p++) {
            if (prime[p])
                for (int i = p * p; i <= n; i = i + p)
                    prime[i] = false;
        }

        for (int i = 2; i  <= n; i++) {
            if (prime[i]) {
                System.out.println(i);
            }
        }
    }
}
