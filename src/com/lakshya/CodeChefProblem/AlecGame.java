package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlecGame {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        while (n-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            String a = stringTokenizer.nextToken();
            String b = stringTokenizer.nextToken();

            boolean ans = true;
            for (int i = 0; i < b.length(); i++) {
                char c = b.charAt(i);
                if (!a.contains(Character.toString(c))) {
                    ans = false;
                    break;
                }
            };


            System.out.println(ans ? "AlecWon" : "AlecLost");
        }
    }
}
