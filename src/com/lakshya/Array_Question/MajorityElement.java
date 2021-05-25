package com.lakshya.Array_Question;

import java.io.*;
import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
//       for (int num : nums) {
//            int count = 0;
//
//            for (int val : nums) {
//                if (val == num) count++;
//            }
//
//            if (count > nums.length / 2) {
//                return num;
//            }
//        }
//
//        return -1;

//        HashMap<Integer, Integer> hashMap = calculateCount(nums, nums.length);
//
//        Set<Map.Entry<Integer, Integer>> a = hashMap.entrySet();
//
//        for (Map.Entry<Integer, Integer> entry : a) {
//            if (entry.getValue() > nums.length / 2) return entry.getKey();
//        }
//
//        return -1;

        Arrays.sort(nums);

        return nums[nums.length / 2];
    }

//    private static HashMap<Integer, Integer> calculateCount(int[] nums, int length) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//
//        for (int num : nums) {
//            if (hashMap.containsKey(num))
//                hashMap.put(num, hashMap.get(num) + 1);
//            else
//                hashMap.put(num, 1);
//        }
//
//        return hashMap;
//    }

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
