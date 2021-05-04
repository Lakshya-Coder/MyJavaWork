package com.lakshya.String;

import java.util.HashSet;

public class PrintAllSubsequencesSring {

    static HashSet<String> hashSet1 = new HashSet<>();
    static HashSet<String> hashSet2 = new HashSet<>();

    public static void printAllSubsequenceSolution1(String string, String answer) {
        if (string.length() == 0) {
            hashSet1.add(answer);
            return;
        }

        // put
        printAllSubsequenceSolution1(string.substring(1), answer + string.charAt(0));

        // don't put
        printAllSubsequenceSolution1(string.substring(1), answer);
    }

    public static void printAllSubsequenceSolution2(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length(); j > i; j--) {
                String sub_str = str.substring(i, j);

                hashSet2.add(sub_str);

                for (int k = 1; k < sub_str.length(); k++) {
                    StringBuffer stringBuffer = new StringBuffer(sub_str);

                    stringBuffer.deleteCharAt(k);
                    hashSet2.add(stringBuffer.toString());

                    if (hashSet2.contains(stringBuffer.toString()))
                    printAllSubsequenceSolution2(stringBuffer.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";

        printAllSubsequenceSolution1(str, "");
        printAllSubsequenceSolution2(str);

        System.out.println(hashSet1);
        System.out.println(hashSet2);
    }

}
