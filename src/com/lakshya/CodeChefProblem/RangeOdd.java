package com.lakshya.CodeChefProblem;

public class RangeOdd {
    public static void main(String[] args) throws Exception {
        java.io.InputStream in = System.in;
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));

        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(reader.readLine());
        int l = Integer.parseInt(stringTokenizer.nextToken());
        int r = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = l; i <= r; i++)
            if (i % 2 != 0)
                System.out.print(i + " ");
    }
}
