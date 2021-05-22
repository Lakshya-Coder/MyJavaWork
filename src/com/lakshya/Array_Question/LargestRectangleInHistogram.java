// Problem link: https://leetcode.com/problems/largest-rectangle-in-histogram/
package com.lakshya.Array_Question;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public static long largestRectangleArea(long[] hi, long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return hi[0];
        }

        int topOfStackInInt;
        long max = Long.MIN_VALUE;
        Stack<Long> st = new Stack<>();
        st.add(0L); // This is the default value of this stack

        for (long i = 1; i < n; i++) {
            long curr = hi[(int) i];

            topOfStackInInt = Math.toIntExact(st.peek());
            if (curr >= hi[topOfStackInInt]) /*
                                              * If current element is greater than st.peek(), so we need to add the
                                              * index of current value in stack
                                              */
                st.add(i);
            else {
                while (!st.isEmpty() && curr < hi[Math.toIntExact(st.peek())]) {
                    topOfStackInInt = Math.toIntExact(st.pop());
                    long tmp = hi[topOfStackInInt];

                    if (st.isEmpty())
                        max = Math.max(max, tmp * i); // Finding the width of rectangle
                    else
                        max = Math.max(max, tmp * (i - st.peek() - 1)); // Finding the width of rectangle
                }
                st.add(i);
            }
        }

        if (!st.isEmpty()) {
            int i = hi.length;

            while (!st.isEmpty()) {
                topOfStackInInt = Math.toIntExact(st.pop());
                long tmp = hi[topOfStackInInt];

                if (st.isEmpty()) {
                    max = Math.max(max, tmp * i);
                } else {
                    max = Math.max(max, tmp * (i - st.peek() - 1));
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        long[] arr = { 2, 1, 5, 6, 2, 3 };
        long ans = largestRectangleArea(arr, arr.length);

        System.out.println(ans);
    }

}
