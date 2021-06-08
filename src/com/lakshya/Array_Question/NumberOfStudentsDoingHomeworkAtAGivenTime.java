package com.lakshya.Array_Question;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {
	static class Solution {
		public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
			int n = startTime.length;
			int cnt = 0;

			for (int i = 0; i < n; i++)
				if (startTime[i] <= queryTime && endTime[i] >= queryTime)
					cnt++;

			return cnt;
		}
	}

	public static void main(String[] args) {
		int[] startTime = {1, 2, 3};
		int[] endTime = {3, 2, 7};
		int queryTime = 4;

		Solution solution = new Solution();
		System.out.println(solution.busyStudent(startTime, endTime, queryTime));
	}
}