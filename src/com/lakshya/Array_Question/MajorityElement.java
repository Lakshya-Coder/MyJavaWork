package com.lakshya.Array_Question;

import java.io.*;
import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        int ans_idx = 0;
        int cnt = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[ans_idx]) {
                cnt++;
            } else {
                cnt--;
            }

            if (cnt == 0) {
                ans_idx = i;
                cnt = 1; // Set the cnt to default value
            }
        }

        int countOfAnsIdx = 0;
        for (int num : arr) {
            if (num == arr[ans_idx]) {
                countOfAnsIdx++;
            }

            if (countOfAnsIdx > n / 2) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
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
