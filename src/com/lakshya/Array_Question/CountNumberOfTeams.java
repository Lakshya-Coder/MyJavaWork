package com.lakshya.Array_Question;

public class CountNumberOfTeams {
    static class Solution {
        public int numTeams(int[] rating) {
            int n = rating.length;
            int numOfTeams = 0;

            for (int i = 1; i < n; i++) {
                int leftLess = 0; // 1 
                int rightGreater = 0; // 2 3

                int leftGreater = 0; // 4
                int rightLess = 0; // 3 2 

                for (int j = i - 1; j >= 0; j--) {
                    if (rating[i] > rating[j]) {
                        leftLess++;
                    } else {
                        leftGreater++;
                    }
                }

                for (int j = i + 1; j < n; j++) {
                    if (rating[i] < rating[j]) {
                        rightGreater++;
                    } else {
                        rightLess++;
                    }
                }

                numOfTeams += (leftLess * rightGreater) + (leftGreater * rightLess);
            }

            return numOfTeams;
        }
    }

    public static void main(String[] args) {
        int[] rating = {2,5,3,4,1};

        Solution solution = new Solution();
        System.out.println(solution.numTeams(rating));
    }
}
