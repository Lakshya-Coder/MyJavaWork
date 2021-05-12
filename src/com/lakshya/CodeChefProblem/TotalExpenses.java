package com.lakshya.CodeChefProblem;

import java.io.*;
import java.util.StringTokenizer;

public class TotalExpenses {
    public static void main(String[] args) throws Exception {
        /*
        
        While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 1000.
        If the quantity and price per item are input, write a program to calculate the total expenses.

        Input
        The first line contains an integer T, total number of test cases. Then follow T lines, each line contains integers quantity and price.

        Output
        For each test case, output the total expenses while purchasing items, in a new line.
        quantity and price

        **/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());
            int quantity = Integer.parseInt(stringTokenizer.nextToken());
            float price = Float.parseFloat(stringTokenizer.nextToken());

            if (quantity <= 1000) {
                System.out.println(quantity * price + "00000");
            } else {
                float x = ((quantity * price) / 10); // -> 10%
                float y = (quantity * price) - x;

                System.out.println(y + "00000");
            }
        }
    }
}