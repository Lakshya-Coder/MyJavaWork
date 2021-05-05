package com.lakshya.String;

public class SentenceIsPangram {
	public static boolean checkIfPangram(String sentence) {
//         Set<Character> set = new HashSet<>();
        
//         for (char c : sentence.toCharArray()) {
//             set.add(c);
//         }
        
//         return set.size() == 26;
        sentence.replace(" ", "");
        int[] arr = new int[26];
        for (char c : sentence.toCharArray()) {
            int index = c - 'a';
            arr[index] = 1;
        }
        
        for (int val : arr) {
            if (val == 0) {
                return false;
            }
        }
        
        return true;
    }

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));	
	}
}