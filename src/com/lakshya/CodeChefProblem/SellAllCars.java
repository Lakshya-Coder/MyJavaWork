package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class SellAllCars {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            int n = Integer.parseInt(stringTokenizer.nextToken());
            ArrayList<Integer> arrayList = new ArrayList(n);

            stringTokenizer = new StringTokenizer(reader.readLine());

            for (int i = 0; i < n; i++)
                arrayList.add(Integer.parseInt(stringTokenizer.nextToken()));

            arrayList.sort(Collections.reverseOrder());

            int ans = 0;

            for (int i = 0; i < n; i++) {
                ans += Math.max(0, arrayList.get(i) - i);
                ans %= 1_000_000_007;
            }

            System.out.println(ans);
        }
    }
}
