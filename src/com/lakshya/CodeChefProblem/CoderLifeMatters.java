package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoderLifeMatters {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            int count = 0;
            boolean answer = false;

            for (int i = 0; i < 30; i++) {
                String currentToken = stringTokenizer.nextToken();

                if (currentToken.equals("1")) {
                    count++;

                    if (count > 5) {
                        answer = true;
                        break;
                    }
                } else if (currentToken.equals("0")) {
                    count = 0;
                }
            }

            if (answer)
                System.out.println("#coderlifematters");
            else
                System.out.println("#allcodersarefun");
        }
    }
}
