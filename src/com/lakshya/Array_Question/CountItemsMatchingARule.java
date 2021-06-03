package com.lakshya.Array_Question;

import java.util.*;

public class CountItemsMatchingARule {
    static class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            // type, color and name
//            int cnt = 0;
//
//            for (List<String> list : items) {
//                if (ruleKey.equals("type") && ruleValue.equals(list.get(0))) {
//                    cnt++;
//                } else if (ruleKey.equals("color") && ruleValue.equals(list.get(1))) {
//                    cnt++;
//                } else if (ruleKey.equals("name") && ruleValue.equals(list.get(2))) {
//                    cnt++;
//                }
//            }
//
//            return cnt;

            int idx = 0;
            int cnt = 0;

            if (ruleKey.charAt(0) == 't') {
                idx = 0;
            } else if (ruleKey.charAt(0) == 'c') {
                idx = 1;
            } else {
                idx = 2;
            }

            for (List<String> list : items) {
                if (ruleValue.equals(list.get(idx))) {
                    cnt++;
                }
            }

            return cnt;
        }
    }

    public static void main(String[] args) {
       // Type your code to run this is your test
    }
}
