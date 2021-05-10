package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberMirror {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int num = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(num);
    }
}
