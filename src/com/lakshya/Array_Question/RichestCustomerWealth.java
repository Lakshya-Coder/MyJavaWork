package com.lakshya.Array_Question;

import java.util.Arrays;

public class RichestCustomerWealth {
    static class Solution {
        public int maximumWealth(int[][] accounts) {
             int maximumWealth = Integer.MIN_VALUE;

             int n = accounts.length;

             for (int i = 0; i < n; i++) {
                 int wealth = 0;

                 for (int num : accounts[i]) {
                     wealth = wealth + num;
                 }

                 maximumWealth = Math.max(maximumWealth, wealth);
             }

             return maximumWealth;
//             return Arrays.stream(accounts)
//                .mapToInt(i -> Arrays.stream(i).sum())
//                    .max().getAsInt();
        }
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};

        Solution solution = new Solution();
        System.out.println(solution.maximumWealth(accounts));
    }
}
