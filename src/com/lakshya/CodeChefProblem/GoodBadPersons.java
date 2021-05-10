package com.lakshya.CodeChefProblem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoodBadPersons {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            int n = Integer.parseInt(stringTokenizer.nextToken());
            int k = Integer.parseInt(stringTokenizer.nextToken());

            stringTokenizer = new StringTokenizer(reader.readLine());
            String string = stringTokenizer.nextToken();

            int longCaseCount = 0;
            int smallCaseCount = 0;

            for (int i = 0; i < n; i++) {
                int curr = string.charAt(i);

                if (curr >= 65 && curr <= 90) {
                    longCaseCount++;
                } else {
                    smallCaseCount++;
                }
            }

            // longCaseCount -> smallCaseCount
            // smallCaseCount -> longCaseCount

            boolean brother = false;
            boolean chef = false;

            if (k >= longCaseCount && k >= smallCaseCount) {
                brother = true;
                chef = true;
            } else if (k >= longCaseCount)
                chef = true;
            else if (k >= smallCaseCount)
                brother = true;

            if (brother && chef)
                System.out.println("both");
            else if (brother)
                System.out.println("brother");
            else if (chef)
                System.out.println("chef");
            else
                System.out.println("none");
        }
    }
}
