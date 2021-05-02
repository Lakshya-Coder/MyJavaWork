package com.lakshya.String;

public class CountTheNumberConsistentStrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        if (allowed.isEmpty()) {
            return -1;
        }

        int count = 0;
        for (String curr_str : words) {
            boolean allTrue = true;
            for (Character c : curr_str.toCharArray()) {
                boolean hasCharacterInAllowed = allowed.contains(c.toString());
                if (!hasCharacterInAllowed) {
                    allTrue = false;
                }
            }

            count = allTrue ? count + 1 : count;
        }

        return count;
    }

    public static void main(String[] args) {
        /*

         Time complexity {
            O(nm)
            n -> length of words array
            m -> words[i].length()
         }

         Space complexity {
            O(m)
            m -> words[i].length()
         }

        */
        String allowed = "lhcaxfkst";
        String[] words = {"tcxkxhsfhf","cffak","tf","s","fl","sc","ffffhfs","ubv","fhlxctt","tcivkal","saff","t"};

        System.out.println(countConsistentStrings(allowed, words));
    }
}
