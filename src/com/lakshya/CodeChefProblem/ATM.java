package com.lakshya.CodeChefProblem;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float amount;
        float balance;

        amount = sc.nextFloat();
        balance = sc.nextFloat();

        float remaining_val;

        if (amount % 5 == 0) {
            remaining_val = (balance - (amount + 0.5F));
        } else {
            remaining_val = balance;
        }

        System.out.println(remaining_val + "0");
    }
}
