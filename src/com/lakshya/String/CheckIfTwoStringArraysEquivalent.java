package com.lakshya.String;

public class CheckIfTwoStringArraysEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String curr : word1) {
            sb1.append(curr);
        }

        for (String curr : word2) {
            sb2.append(curr);
        }

        String str1 = sb1.toString();
        String str2 = sb2.toString();

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                char curr1 = str1.charAt(i);
                char curr2 = str2.charAt(i);

                if (curr1 != curr2)
                    return false;
            }
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {

    }
}
