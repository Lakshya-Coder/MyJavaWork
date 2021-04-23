package com.lakshya.String;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateString {
    static final int CHAR_COUNT  = 256;

    public static void fillCharCounts(String s, int[] count) {
        for (char c : s.toCharArray()) {
            count[c]++;
        }
    }

    public static void printDuplicateString(String s) {
//        int[] count = new int[CHAR_COUNT];
//        fillCharCounts(s, count);
//
//        for (int i = 0; i < CHAR_COUNT; i++) {
//            if (count[i] > 1) {
//                System.out.println((char) i + ", count = " + count[i]);
//            }
//        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            if (!hashMap.containsKey(curr)) {
                hashMap.put(s.charAt(i), 1);
            } else {
                hashMap.put(curr, hashMap.get(curr) + 1);
            }
        }

        for (Map.Entry<Character, Integer> mapElement : hashMap.entrySet()) {
            char key = mapElement.getKey();
            int val = mapElement.getValue();

            if (val > 1) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        String str = "test string";
        printDuplicateString(str);
    }
}
