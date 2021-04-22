// Problem link: https://leetcode.com/problems/reverse-string/
package com.lakshya.String;

public class ReverseString {

    public static void swap(char[] s, int i, int j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }

    public static void reverseString(char[] s) {
        // We are using two pointer approach
        if (s == null || s.length == 0) return;

        int n = s.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            swap(s, i++, j--);
        }
    }

    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd', 'e'};
        reverseString(s);
        System.out.println(java.util.Arrays.toString(s));
    }

}
