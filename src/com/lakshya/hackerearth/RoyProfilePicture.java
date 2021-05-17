package com.lakshya.hackerearth;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoyProfilePicture {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int l = Integer.parseInt(stringTokenizer.nextToken());

        /**
         * [1] If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
         * [2] If width and height, both are large enough and
         * (a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
         * (b) else user is prompted to crop it. Print "CROP IT" in this case.
         */

        stringTokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        while (n-- != 0) {
            stringTokenizer = new StringTokenizer(reader.readLine());

            int w = Integer.parseInt(stringTokenizer.nextToken());
            int h = Integer.parseInt(stringTokenizer.nextToken());

            if (w < l || h < l) {
                System.out.println("UPLOAD ANOTHER");
            } else {
                if (w == h) {
                    System.out.println("ACCEPTED");
                } else {
                    System.out.println("CROP IT");
                }
            }
        }
    }
}
