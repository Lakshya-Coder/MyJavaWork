package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IsBothOrNot {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());

        int mod_5 = n % 5;
        int mod_11 = n % 11;

        if (mod_5 == 0 && mod_11 == 0)
            System.out.println("BOTH");
        else if (mod_5 == 0 || mod_11 == 0)
            System.out.println("ONE");
        else
            System.out.println("NONE");
    }
}
