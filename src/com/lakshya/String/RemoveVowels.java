public class RemoveVowels { 
	public static String removeVowels(String str) {
		// Vowels are: a e i o u
		java.util.Set<Character> vowels = new java.util.HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		StringBuilder result = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (!vowels.contains(c)) {
				result.append(c);
			}
		}

		return result.toString();
	} 

	public static void main(String[] args) {
		System.out.println(removeVowels("leetcodeisacommunityforcoders"));
	}
}