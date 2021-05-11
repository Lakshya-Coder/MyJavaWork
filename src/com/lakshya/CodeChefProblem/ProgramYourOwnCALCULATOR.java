package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProgramYourOwnCALCULATOR {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        double a = Double.parseDouble(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(reader.readLine());
        double b = Double.parseDouble(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(reader.readLine());
        String operator = stringTokenizer.nextToken();

        /**
         *
         * if C="+", you have to sum the two numbers.
         *
         * If C="-", you have to subtract the two numbers.
         *
         * If C="*", you have to print the product.
         *
         * If C="/", you have to divide the two numbers.
         *
         */

        double answer = 0D;
        boolean isDivide = false;

        if (operator.equals("+"))
            answer = a + b;
        else if (operator.equals("-"))
            answer = a - b;
        else if (operator.equals("*"))
            answer = a * b;
        else if (operator.equals("/")) {
            isDivide = true;
            answer = a / b;
        }

        if (isDivide) {
            System.out.println(answer);
        } else
            System.out.println((int) answer);
    }
}
