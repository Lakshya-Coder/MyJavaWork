package com.lakshya.Array_Question;

import java.util.*;

public class SlideingWindowMaximum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        Deque<Integer> deque = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[deque.getLast()] < arr[i])
                deque.pollLast();

            deque.addLast(i);
        }

        result.add(arr[deque.peekFirst()]);

        for (int i = k; i < n; i++) {
            if (deque.peekFirst() == i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[deque.getLast()] < arr[i])
                deque.pollLast();

            deque.addLast(i);
            result.add(arr[deque.peekFirst()]);
        }

        System.out.println(result);
    }

}
