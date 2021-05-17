package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EncodingMessage {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());

            stringTokenizer = new StringTokenizer(reader.readLine());
            String str = stringTokenizer.nextToken();

            if (n % 2 != 0)
                n = n - 1;

            StringBuilder temp = new StringBuilder();

            for (int i = 0; i + 1 < n; i += 2) {
                temp.append(str.charAt(i + 1));
                temp.append(str.charAt(i));
            }

            if (str.length() % 2 != 0)
                temp.append(str.charAt(str.length() - 1));

            str = temp.toString();
            temp = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char curr = str.charAt(i);

                int x = curr - 'a';
                int val = 'a' + 25 - x;
                temp.append((char) val);
            }

            str = temp.toString();
            System.out.println(str);
        }
    }
}
