package com.lakshya.Array_Question;

import java.util.Stack;

import static java.lang.Math.min;

public class TrapingRainWater {
    public static int rain_water(int[] height) {
        int ans = 0;
        int current = 0;

        Stack<Integer> st = new Stack<>();

        while (current < height.length) {
            while (!st.isEmpty() && height[current] > height[st.peek()]) {
                int top = st.pop();

                if (st.isEmpty())
                    break;
                int distance /* or difference */ = current - st.peek() - 1;
                int bounded_height = Math.min(height[current], height[st.peek()]) - height[top];
                ans += distance *  bounded_height;
            }
            st.add(current++);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 6};

        int ans = rain_water(arr);

         System.out.println(ans);
    }
}
