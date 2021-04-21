// Problem link: https://practice.geeksforgeeks.org/problems/kth-element-in-matrix/1#

package com.lakshya.Matrix_Question;

import java.util.PriorityQueue;

public class KthElementMatrix {
    public static PriorityQueue<Integer> fetchData(int[][] mat,int n) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            for (int val : mat[i])
                priorityQueue.add(val);
        }

        return priorityQueue;
    }

    public static int kthSmallest(int[][] mat,int n,int k) {
        PriorityQueue<Integer> priorityQueue = fetchData(mat, mat.length);

        for (int i = 1; i < k; i++) {
            priorityQueue.poll();
        }

        return priorityQueue.isEmpty() ? -1 : priorityQueue.poll();
    }

    public static void main(String[] args) {
        int[][] mat = { {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {24, 29, 37, 48},
                        {32, 33, 39, 50} };

        int ans = kthSmallest(mat, mat.length, 7);
        System.out.println(ans);
    }
}