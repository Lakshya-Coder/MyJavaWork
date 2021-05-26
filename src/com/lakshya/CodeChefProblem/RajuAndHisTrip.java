package com.lakshya.CodeChefProblem;

public class RajuAndHisTrip {
    public static void main(String[] args) throws Exception {
        java.io.InputStream in = System.in;
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(in));

        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        if (n % 5 == 0|| n % 6 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
