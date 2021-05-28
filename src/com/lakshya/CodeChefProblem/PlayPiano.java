package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlayPiano {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            String log = stringTokenizer.nextToken();

            boolean answer = false;

            int n = log.length();
            for (int i = 0; i < n - 1; i += 2) {
                if (log.charAt(i) == log.charAt(i + 1)) {
                    answer = true;
                    break;
                }
            }

            System.out.println(answer ? "no" : "yes");
        }
    }
}
