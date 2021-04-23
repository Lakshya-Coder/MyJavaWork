// Vlog link: https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/

package com.lakshya.String;

public class ProgramToCheckStringsRotations {

    public static boolean checkStringRotations(String str1, String str2) {
//        if (str1.length() != str2.length()) {
//            System.out.println("No");
//        } else {
//            String temp = str1 + str1;
//            if (temp.contains(str2)) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
//        }
        return (str1.length() == str2.length()) && (str1.indexOf(str2) != -1);
    }

    public static void main(String[] args) {
        boolean ans = checkStringRotations("ABACD", "ABACD");

        System.out.println(ans);
    }

}
