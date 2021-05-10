package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class INTEST {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int t = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

            int n = Integer.parseInt(stringTokenizer.nextToken());

            if (n % k == 0)
                count++;
        }

        System.out.println(count);

    }
}
