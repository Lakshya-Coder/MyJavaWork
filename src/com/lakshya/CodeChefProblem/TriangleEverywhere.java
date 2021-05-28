package com.lakshya.CodeChefProblem;

public class TriangleEverywhere {
    public static void main(String[] args) throws Exception {
        java.io.InputStream in = System.in;
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));

        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(reader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println(1);
            } else if (a == b || b == c || a == c) {
                System.out.println(2);
            } else if (a != b && b != c && a != c) {
                System.out.println(3);
            }
        } else {
            System.out.println(-1);
        }
    }
}
