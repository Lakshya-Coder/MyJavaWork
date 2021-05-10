package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SecondLargest {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());

            // (a >= b) ? a : b;
            int maximum = -1;

            if (a < b) {
                if (a > c)
                    maximum = a;
                else
                    maximum = Math.min(b, c);
            } else if (b < c) {
                if (b > a)
                    maximum = b;
                else
                    maximum = Math.min(a, c);
            } else if (c < a) {
                if (c > b)
                    maximum = c;
                else
                    maximum = Math.min(a, b);
            }

            System.out.println(maximum);
        }
    }
}
