package com.lakshya.String;

public class SplitAStringInBalanced {
    public static int splitAString(String string) {
        int max_count = 0;
        int count = 0;

        for (char c : string.toCharArray()) {
            if (c == '0') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                max_count++;
            }
        }

        return max_count;
    }

    public static void main(String[] args) {
        String string = "0100110101";
        int max_count = splitAString(string);

        System.out.println(max_count);
    }
}
