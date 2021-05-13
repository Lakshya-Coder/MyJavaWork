package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountOneOfBinaryRepresentation {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        n &= (n - 1);
        int count = 1;

        while (n != 0) {
            count++;
            n &= (n - 1);
        }

        System.out.println(count);
    }
}
