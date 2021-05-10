package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FancyQuotes {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            boolean answer = false;

            while (stringTokenizer.hasMoreTokens()) {
                String string = stringTokenizer.nextToken();

                if (string.matches("not"))
                    answer = true;
            }

            if (answer)
                System.out.println("Real Fancy");
            else
                System.out.println("regularly fancy");
        }
    }
}
