package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefAndHisDailyRoutine {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            String string = stringTokenizer.nextToken();

            int len = string.length();
            int count = 0;
            for (int i = 0; i < len - 1; i++) {
                int curr_char = string.charAt(i);

                if (curr_char == 'C') {
                    if (string.charAt(i + 1) == 'E' || string.charAt(i + 1) == 'S' ||
                            string.charAt(i + 1) == 'C')
                        count++;
                } else if (curr_char == 'E') {
                        if (string.charAt(i + 1) == 'S' || string.charAt(i + 1) == 'E')
                            count++;
                } else if (curr_char == 'S') {
                        if (string.charAt(i + 1) == 'S')
                            count++;
                }
            }

            if (count == len - 1) {
                System.out.println("yes");
            } else
                System.out.println("no");
        }
    }
}
