package com.lakshya.Array_Question;

import java.io.*;
import java.util.StringTokenizer;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        for (int num : nums) {
            int count = 0;

            for (int val : nums) {
                if (val == num) count++;
            }

            if (count > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("../../input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("../../output.txt")));

        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(reader.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = Integer.parseInt(stringTokenizer.nextToken());

        int answer = majorityElement(nums);
        System.out.println(answer);
    }
}
