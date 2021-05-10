package com.lakshya.String;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.next();

        int maxLength = 0;
        int start = -1;

        int[] frequency = new int[256];
        Arrays.fill(frequency, -1);

        int n = string.length();
        for (int i = 0; i < n; i++) {
            int curr = string.charAt(i);
            if (frequency[curr] > start)
                start = frequency[curr];
            frequency[curr] = i;
            maxLength = Math.max(maxLength, i - start);
        }

        System.out.println(maxLength);
    }
}
