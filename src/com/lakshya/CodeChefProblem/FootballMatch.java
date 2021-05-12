package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FootballMatch {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());

            String a = "";
            String b = "";

            int a_count = 0;
            int b_count = 0;

            for (int i = 0; i < n; i++) {
                stringTokenizer = new StringTokenizer(reader.readLine());
                String string = stringTokenizer.nextToken();

                if (a.equals(string) || a.equals("")) {
                    a = string;
                    a_count++;
                } else if (b.equals(string) || b.equals("")) {
                    b = string;
                    b_count++;
                }
            }

            if (a_count == b_count) {
                System.out.println("Draw");
            } else if (a_count > b_count) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
}
