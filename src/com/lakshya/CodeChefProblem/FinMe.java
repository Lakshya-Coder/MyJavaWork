package com.lakshya.CodeChefProblem;

public class FinMe {
    public static void main(String[] args) throws Exception {
        java.io.InputStream in = System.in;
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));

        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(reader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        boolean result = false;
        stringTokenizer = new java.util.StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(stringTokenizer.nextToken());

            if (val == k) {
                result = true;
                break;
            }
        }

        System.out.println(result ? 1 : -1);
    }
}
