package com.lakshya.CodeChefProblem;

import java.io.*;
import java.util.StringTokenizer;

public class TheBlockGame {
    public static boolean palindromeString(String string) {
        int n = string.length();
        int i = 0, j = n - 1;

        while (i < j) {
            if (string.charAt(i) == string.charAt(j)) {
                i++; j--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            String string = stringTokenizer.nextToken();

            boolean answer = palindromeString(string);
            if (answer)
                System.out.println("wins");
            else
                System.out.println("loses");         
        }
    } 
}
