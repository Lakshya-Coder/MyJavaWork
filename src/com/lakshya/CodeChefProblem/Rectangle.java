package com.lakshya.CodeChefProblem;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if ((a == b && d == c) || (a == d && b == c) || (a == c && b == d)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
