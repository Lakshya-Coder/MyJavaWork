package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlternativeSquarePattern {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());

        int odd_number_begin = 1;
        int odd_number_end = 5;

        int even_number_begin = 10;
        int even_number_end = odd_number_end + 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = odd_number_begin; j <= odd_number_end; j++) 
                    System.out.print(j + " ");
                System.out.println();

                odd_number_begin = 10 + odd_number_begin;
                odd_number_end = 10 + odd_number_end;
            } else {
                for (int j = even_number_begin; j >= even_number_end; j--)
                   System.out.print(j + " ");
                System.out.println();

                even_number_begin = 10 + even_number_begin;
                even_number_end = 10 + even_number_end;
            }
        }
    }
}
