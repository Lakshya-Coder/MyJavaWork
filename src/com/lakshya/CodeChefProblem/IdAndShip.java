package com.lakshya.CodeChefProblem;

import java.io.*;
import java.util.StringTokenizer;

public class IdAndShip {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int t = Integer.parseInt(stringTokenizer.nextToken());

        while (t-- != 0) {
            stringTokenizer=new StringTokenizer(reader.readLine());
            String str = stringTokenizer.nextToken().toLowerCase();

            int x = str.charAt(0);

            String answer = "BattleShip";

            switch (x) {
                case 99: // c
                    answer = "Cruiser";
                    break;
                case 100: // d
                    answer = "Destroyer";
                    break;
                case 102: // f
                    answer = "Frigate";
                    break;
            }

            System.out.println(answer);
        }
    }
}
