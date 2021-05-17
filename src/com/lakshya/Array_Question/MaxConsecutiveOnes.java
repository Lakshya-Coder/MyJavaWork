package com.lakshya.Array_Question;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        sc.close();

        // arr[i..j]
        // arr[i.. j + 1]
        // arr[i + 1 ..j]
        int zeroCount = 0;
        int i = 0;
        int ans = 0;

        for (int j = 0; j < n; j++) {
            if (arr[j] == 0)
                zeroCount++;
            while (zeroCount > k) {
                if (arr[i++] == 0)
                    zeroCount--;
            }

            // zeroCount <= k
            ans = Math.max(ans, j - i + 1/* length of window */);
        }

        System.out.println(ans);
    }
}
