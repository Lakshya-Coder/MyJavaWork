package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LuckyFour {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            String string = stringTokenizer.nextToken();

            int count = 0;

            int n = string.length();
            for (int i = 0; i < n; i++) {
                char curr_char = string.charAt(i);

                if (curr_char == '4') {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
