package com.lakshya.PepCoding;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FaultyKeyboard {
    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static boolean isPossible(String name, String typed) {
        if (name.length() > typed.length()) return false;

        int i = 0;
        int j = 0;

        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++; j++;
            } else if (i > 0 && name.charAt(i - 1) == typed.charAt(j)) {
                j++;
            } else
                return false;
        }

        while (j < typed.length()) {
            if (name.charAt(i - 1) != typed.charAt(j)) {
                return false;
            }
            j++;
        }

        return i < name.length()  ? false : true;
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scn = new Scanner(System.in);

        String name = scn.next();
        String typed = scn.next();

        boolean res = isPossible(name, typed);

        System.out.println(res);
    }
}
