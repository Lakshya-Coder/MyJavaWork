package com.lakshya.CodeChefProblem;

public class ValidTriangleOrNot {
    public static void main(String[] args) throws Exception {
        java.io.InputStream in = System.in;
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));

        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(reader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        int areaOfTriangle = (a * b) / 2;

        if (areaOfTriangle > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
