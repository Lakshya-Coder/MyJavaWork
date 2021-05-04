package com.lakshya.String;

import java.util.*;

public class PermutationsGivenString {
    static HashSet<String> hashSet = new HashSet<>();

    private static String swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

        return String.valueOf(chars);
    }

    public static void helper(String string, int left, int right) {
        if (left == right) { // Base case
            hashSet.add(string);
            return;
        }

        for (int i = left; i < right; i++) {
            string = swap(string.toCharArray(), left, i);
            helper(string, left + 1, right);
            string = swap(string.toCharArray(), left, i);
        }
    }

    public static List<String> find_permutation(String string) {
        helper(string, 0, string.length());

        List<String> list = new ArrayList<>(string.length());

        hashSet.forEach(str -> list.add(str));
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        String string = "abc";

        List<String> list = find_permutation(string);
        System.out.println(list);
    }
}
