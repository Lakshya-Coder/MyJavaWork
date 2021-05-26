package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumIsEverywhere {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());

        long numberOdd = 1;
        long numberEven = 2;

        int counterOdd = 1;
        int counterEven = 1;

        long sumOdd = numberOdd;
        long sumEven = numberEven;

        while (counterOdd != n) {
            numberOdd = numberOdd + 2;
            sumOdd = sumOdd + numberOdd;
            counterOdd++;
        }

        while (counterEven != n) {
            numberEven = numberEven + 2;
            sumEven = sumEven + numberEven;
            counterEven++;
        }

        System.out.println(sumOdd + " " + sumEven);
    }
}
