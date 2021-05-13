package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class COVIDPandemicLongQueue {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());

            ArrayList<Integer> arrayList = new ArrayList<>(n);

            stringTokenizer = new StringTokenizer(reader.readLine());

            for (int i = 1; i <= n; i++) {
                if (Integer.parseInt(stringTokenizer.nextToken()) == 1)
                    arrayList.add(i);
            }

            String ans = "YES";

            for (int i = 0; i + 1 < arrayList.size(); i++)
                if (arrayList.get(i + 1) - arrayList.get(i) < 6) { // x and y
                    ans = "NO";
                    break;
                }

            System.out.println(ans);
        }
    }
}
