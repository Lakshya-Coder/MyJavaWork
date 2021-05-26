package com.lakshya.CodeChefProblem;

public class AddNaturalNumbers {
    public static void main(String[] args) throws Exception {
        java.io.InputStream in = System.in;
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));

        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(reader.readLine());

        long n = Long.parseLong(stringTokenizer.nextToken());

        long answer = 0;

        for (int i = 1; i <= n; i++) {
            answer = answer + i;
        }

        System.out.println(answer);
    }
}
