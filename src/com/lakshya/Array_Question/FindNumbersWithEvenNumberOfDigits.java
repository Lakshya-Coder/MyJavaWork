package com.lakshya.Array_Question;

public class FindNumbersWithEvenNumberOfDigits {
    static class Solution {
        /* public int findLen(int num) {
                int len = 0;
                
                while (num != 0) {
                    len++;
                    num = num / 10;
                }
                
                return len;
            } */
    
        public int findNumbers(int[] nums) {
            /* int cnt = 0;
            
            for (int num : nums) {
                // int len = findLen(num);
                
                // cnt = len % 2 == 0 ? cnt + 1 : cnt;

                String s = String.valueOf(num);
                int len = s.length();
                
                if (len % 2 == 0)
                    cnt++;
            }
            
            return cnt; */

            int cnt = 0;

            for (int num : nums) {
                if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000) {
                    cnt++;
                }
            }

            return cnt;
        }
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        
        Solution solution = new Solution();
        System.out.println(solution.findNumbers(nums));
    }
}
