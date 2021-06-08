package com.lakshya.Array_Question;

import java.util.Arrays;

public class FindNUniqueIntegersSumUpToZero {
	static class Solution {
		public int[] sumZero(int n) {
			// if (n == 1) {
			// 	return new int[] {0};
			// } else if (n == 2) {
			// 	return new int[] {-1, 1};
			// }

			int[] arr = new int[n];

			if (n % 2 == 0) {
				int idx = 0;

				int x = 1;

				while (idx + 1 < n) {
					arr[idx] = x++;
					arr[idx + 1] = arr[idx] * -1;

					idx = idx + 2;
				}
			} else {
				int idx = 0;
				arr[idx++] = 0;

				int x = 1;

				while (idx + 1 < n) {
					arr[idx] = x++;
					arr[idx + 1] = arr[idx] * -1;

					idx = idx + 2;
				}
			}

			return arr;
		}
	}

	public static void main(String[] args) {
		int n = 1;

		Solution solution = new Solution();
		String array = Arrays.toString(solution.sumZero(n));

		System.out.println(array);
	}
}