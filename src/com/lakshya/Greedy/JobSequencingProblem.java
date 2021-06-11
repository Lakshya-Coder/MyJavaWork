package com.lakshya.Greedy;

import java.util.Arrays;

public class JobSequencingProblem {

	static class Job {
		int id;
		int profit;
		int deadLine;

		public Job(int id, int deadLine, int profit) {
			this.id = id;
			this.deadLine = deadLine;
			this.profit = profit;
		}
	}

	static class Solution {
		// Function to find the maximum profit and the number of jobs done.
		public int[] JobScheduling(Job arr[], int n) {
			Arrays.sort(arr, (a, b) -> b.profit - a.profit); // This line sort in descending order
			
			int maximumDeadline = 0;
			for (Job job : arr)
				if (maximumDeadline < job.deadLine)
					maximumDeadline = job.deadLine;
			
			int[] result = new int[maximumDeadline + 1];
			for (int i = 1; i <= maximumDeadline; i++) {
				result[i] = -1;
			}
			
			int countJobs = 0;
			int jobProfit = 0;

			for (int i = 0; i < n; i++) {
				for (int j = arr[i].deadLine; j > 0; j--) {
					if (result[j] == -1) {
						result[j] = i;
						countJobs++;
						jobProfit += arr[i].profit;
						break;
					}
				}
			}

			int[] answer = new int[2];

			answer[0] = countJobs;
			answer[1] = jobProfit;

			return answer;
 		}
	}

	public static void main(String[] args) {
		int n = 4;
		Job[] arr = new Job[n];

		arr[0] = new Job(1,4,20);
		arr[1] = new Job(2,1,10);
		arr[2] = new Job(3,1,40);
		arr[3] = new Job(4,1,30);

		Solution solution = new Solution();

		String result = Arrays.toString(solution.JobScheduling(arr, n));
		System.out.println(result);
	}

}
