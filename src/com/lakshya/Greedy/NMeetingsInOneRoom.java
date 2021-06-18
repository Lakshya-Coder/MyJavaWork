package com.lakshya.Greedy;

import java.util.Arrays;

public class NMeetingsInOneRoom {
    static class Pair {
        int first;
        int second;

        public Pair() {
            this(-1, -1);
        }

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "Pair {" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }

    static class Solution {
        public static Pair[] extractData(int[] start, int[] end, int n) {
            Pair[] pairs = new Pair[n];

            while (n-- != 0) {
                int s = start[n]; // start
                int e = end[n]; // end

                pairs[n] = new Pair(s, e);
            }

            return pairs;
        }

        public static void printAllPairs(Pair[] pairs) {
        	for (Pair pair : pairs)
        		System.out.println(pair);
        }
        
        public static int maxMeetings(int start[], int end[], int n) {
            Pair[] pairs = extractData(start, end, n);
            Arrays.sort(pairs, 
            		(p1, p2) ->  p1.second - p2.second);

            int last = 0; // this variable keeps track of we have not have any overlapping pairs
            int res = 0;
            
            // printAllPairs(pairs);

            for (int i = 0; i < n; i++) {
                if (pairs[i].first > last) {
                    res++;
                    last = pairs[i].second;
                }
            }

            for (int i = 0; i < n; i++) System.out.println(pairs[i]);

            return res;
        }
    }

    public static void main(String[] args) {
        int[] start = {3,1,0,5,8,5};
        int[] end =   {4,2,6,7,9,9};

        int n = start.length;

        int answer = Solution.maxMeetings(start, end, n);
        System.out.println(answer);
    }
}
