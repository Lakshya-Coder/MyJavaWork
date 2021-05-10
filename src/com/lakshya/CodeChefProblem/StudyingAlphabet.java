package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StudyingAlphabet {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        String string = stringTokenizer.nextToken();

        int[] frequency = new int[26];

        for (int i = 0; i < string.length(); i++) {
            frequency[string.charAt(i) - 'a'] = 1;
        }

        stringTokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int count = 0;
            String k = stringTokenizer.nextToken();

            for (int j = 0; j < k.length(); j++)
                if (frequency[k.charAt(j) - 'a'] == 0)
                    count++;

            if (count > 0)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
