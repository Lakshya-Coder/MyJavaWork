package com.lakshya.Array_Question;

public class MinimumTimeVisitingAllPoints {
    static class Solution {
            public int minTimeToVisitAllPoints(int[][] points) {
    //         int n = points.length;
            
    //         int result = 0;
            
    //         for (int i = 0; i + 1 < n; i++) {
    //             int x1 = points[i][0];
    //             int y1 = points[i][1];
                
    //             int x2 = points[i + 1][0];
    //             int y2 = points[i + 1][1];
                
    //             // {x1, y1} -> {x2, y2}
    //             result = result + calculateSteps(x1, y1, x2, y2);
    //         }
            
    //         return result;
            
            int n = points.length;
            
            int ans = 0;
            
            for (int i = 1; i < n; i++) {
                ans = ans + Math.max(Math.abs(points[i][1] - points[i - 1][1]), Math.abs(points[i][0] - points[i - 1][0]));
            }
            
            return ans;
        }
    
        public int calculateSteps(int x1, int y1, int x2, int y2) {
            int cnt = 0;
            
            while (x1 != x2 || y1 != y2) {
                if (x1 != x2 && y1 != y2) {
                    cnt++;
                    
                    if (x1 > x2)
                        x1--;
                    else if (x1 < x2)
                        x1++;
                    
                    if (y1 > y2)
                        y1--;
                    else if (y1 < y2)
                        y1++;
                } else if (x1 != x2) {
                    cnt++;
                    
                    if (x1 > x2)
                        x1--;
                    else if (x1 < x2)
                        x1++;
                } else {
                    cnt++;
                    
                    if (y1 > y2)
                        y1--;
                    else if (y1 < y2)
                        y1++;
                }
            }
            
            return cnt;
        }
    }

    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};

        Solution solution = new Solution();

        System.out.println(solution.minTimeToVisitAllPoints(points));
    }
}
