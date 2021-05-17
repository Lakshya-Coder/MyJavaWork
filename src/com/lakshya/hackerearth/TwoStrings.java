package com.lakshya.hackerearth;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoStrings {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            String a = stringTokenizer.nextToken(), b = stringTokenizer.nextToken();

            int[] arr = new int[26];

            for (int i = 0; i < a.length(); i++) {
                arr[a.charAt(i) - 'a']++;
            }

            for (int i = 0; i < b.length(); i++) {
                arr[b.charAt(i) - 'a']--;
            }

            boolean ans = true;
            for (int val : arr)
                if (val != 0) ans = false;

            System.out.println(ans ? "YES" : "NO");
        }
    }
}
