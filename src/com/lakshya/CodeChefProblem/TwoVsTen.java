package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoVsTen {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            int val = Integer.parseInt(stringTokenizer.nextToken());

            if (val % 10 == 0) {
                System.out.println(0);
            } else if (val % 5 == 0) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
