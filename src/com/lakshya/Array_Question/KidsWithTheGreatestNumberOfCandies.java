package com.lakshya.Array_Question;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {
    static class Solution {
        private int findMaximumCandies(int[] candies, int n) {
            int result = Integer.MIN_VALUE;

            for (int candy : candies) {
                result = Math.max(result, candy);
            }

            return result;
        }

        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int n = candies.length;
            int maximumCandies = findMaximumCandies(candies, n);

            List<Boolean> result = new ArrayList<>(n);

            for (int candy : candies) {
                if (candy + extraCandies >= maximumCandies) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        Solution solution = new Solution();
        System.out.println(solution.kidsWithCandies(candies, extraCandies));
    }
}
