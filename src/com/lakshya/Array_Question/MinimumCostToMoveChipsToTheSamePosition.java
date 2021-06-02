package com.lakshya.Array_Question;

public class MinimumCostToMoveChipsToTheSamePosition {
    static class Solution {
        public int minCostToMoveChips(int[] positions) {
            int odd = 0;
            int even = 0;

            for (int position : positions) {
                if (position % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            int result = Math.min(odd, even);
            return result;
        }
    }

    public static void main(String[] args) {
        int[] positions = {2, 2, 2, 3, 3};

        Solution solution = new Solution();
        System.out.println(solution.minCostToMoveChips(positions));
    }
}
