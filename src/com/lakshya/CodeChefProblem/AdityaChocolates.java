package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AdityaChocolates {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int rs = Integer.parseInt(stringTokenizer.nextToken());

        int total = 0;
        while (rs >= 500) {

                total += 1000;
                rs -= 500;
        }

        while (rs >= 5) {
            total +=5;
            rs-=5;
        }

        System.out.println(total);
    }
}
