package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefAndTableTennis {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            String str = stringTokenizer.nextToken();

            int count_of1 = 0;
            int count_of0 = 0;

            int n = str.length();
            for (int i = 0; i < n; i++) {
                char curr = str.charAt(i);

                if (curr == '0')
                    count_of0++;
                else if (curr == '1')
                    count_of1++;
            }

            if (count_of1 > count_of0)
                System.out.println("WIN");
            else
                System.out.println("LOSE");
        }
    }
}
