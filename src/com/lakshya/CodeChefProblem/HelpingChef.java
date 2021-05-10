package com.lakshya.CodeChefProblem;

import java.util.Scanner;

public class HelpingChef {
    /*

    Write a program, which takes an integer N and if the number
    is less than 10 then display "Thanks for helping Chef!"
    otherwise print "-1".

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();

            if (n < 10) {
                System.out.println("Thanks for helping Chef!");
            } else
                System.out.println(-1);
        }
    }
}
