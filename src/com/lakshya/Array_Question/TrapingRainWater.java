package com.lakshya.Array_Question;

import java.util.Stack;

import static java.lang.Math.min;

public class TrapingRainWater {
    public static int rain_water(int[] arr) {
        int n = arr.length, ans = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                int curr = stack.pop();

                if (stack.isEmpty())
                    break;
                else {
                    int diff = i - stack.peek() - 1; // length of container
                    ans += (min(arr[stack.peek()], arr[i]) - arr[curr]) * diff;
                }
            }

            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 6};

        int ans = rain_water(arr);

        // System.out.println(ans);
    }
}
