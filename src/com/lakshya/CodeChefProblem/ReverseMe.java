package com.lakshya.CodeChefProblem;

public class ReverseMe {
    public static void main(String[] args) throws Exception {
        java.io.InputStream in = System.in;
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));

        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        int[] arr = new int[n];
        int idx = 0;

        stringTokenizer = new java.util.StringTokenizer(reader.readLine());
        while (n -- != 0)
            arr[idx++] = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}
