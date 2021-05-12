package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mahasena {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        int count_of_even = 0;
        int count_of_odd = 0;

        stringTokenizer = new StringTokenizer(reader.readLine(), " .\0");

        for (int i = 0; i < n; i++) {
            int no_of_weapons = Integer.parseInt(stringTokenizer.nextToken());

            if (no_of_weapons % 2 == 0) {
                count_of_even++;
            } else {
                count_of_odd++;
            }
        }

        if (count_of_even > count_of_odd)
            System.out.println("READY FOR BATTLE");
        else
            System.out.println("NOT READY");
    }
}
