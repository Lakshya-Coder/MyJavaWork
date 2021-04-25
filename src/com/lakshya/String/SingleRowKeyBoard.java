package com.lakshya.String;

public class SingleRowKeyBoard {
	public static int calculateTime(String keyboard, String word) {
		int time = 0;
		int fromIndex = 0; // In this variable we contain previous index c

		for (char c : word.toCharArray()) {
			int fingerMoves = Math.abs(fromIndex - keyboard.indexOf(c)); // fingerMoves is always greate than or equal to 0
			fromIndex = keyboard.indexOf(c);
			time += fingerMoves;
		}

		return time;
	}

	public static void main(String[] args) {
		System.out.println(calculateTime("abcdefghijkimnoparstuvwxyz", "cba"));
	}
}