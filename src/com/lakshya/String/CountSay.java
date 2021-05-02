// Problem link: https://leetcode.com/problems/count-and-say/

package com.lakshya.String;

public class CountSay {
    public static String countAndSay(int n) {
        /*

        1
        11
        21
        1211
        111221
        312211
        13112221

        */
        if (n == 1) return "1";
        if (n == 2) return "11";

        String string = "11";
        System.out.println(string.length());
        for (int i = 2; i < n; i++) {
            String temp_str = "";
            string = string + '&'; // This will work like a stopping point
            int counter = 1; // Every value we encounter is at least comes 1 time
            for (int j = 1; j < string.length(); j++) {
                if (string.charAt(j) != string.charAt(j-1)) { // If we go in this condition so, we have encounter '&' or you say delimiter
                    temp_str = temp_str + counter; // count process
                    temp_str = temp_str + string.charAt(j-1 /* j-1 because jth character is this '&' just because we do j-1 */ ); // say process
                    counter = 1; // set the default value of counter which is 1
                } else {
                    counter++;
                }
            }
            string = temp_str;
        }

        return string;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
