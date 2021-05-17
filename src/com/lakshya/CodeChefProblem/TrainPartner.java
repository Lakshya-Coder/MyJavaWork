package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TrainPartner {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());

            if (n % 8 == 0) {
                System.out.println(n - 1 + "SL");
            } else if (n % 8 == 7) {
                System.out.println(n + 1 + "SU");
            } else if (n % 8 == 1) {
                System.out.println(n + 3 + "LB");
            } else if (n % 8 == 4) {
                System.out.println(n  -3 + "LB");
            } else if (n % 8 == 2) {
                System.out.println(n  +3 + "MB");
            } else if (n % 8 == 5) {
                System.out.println(n  -3 + "MB");
            } else if (n % 8 == 3) {
                System.out.println(n  +3 + "UB");
            } else if (n % 8 == 6) {
                System.out.println(n  -3 + "UB");
            }
        }
    }
}
