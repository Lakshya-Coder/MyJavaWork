package com.lakshya.Array_Question;

import java.util.*;

public class FindAllFourSumNumbers {
	static class Solution {
		public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int key) {
//            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
//            int n = arr.length;
//
//            // Sort the array
//            Arrays.sort(arr);
//    
//            for (int i = 0; i < n - 3; i++) {
//                // Skip the same values
//                if (i > 0 && arr[i] == arr[i - 1]) 
//                    continue;
//
//                for (int j = i + 1; j < n - 2; j++) {
//                    // Skip the same values
//                    if (j > i + 1 && arr[j] == arr[j - 1])
//                        continue;
//
//                    for (int k = j + 1; k < n - 1; k++) {
//                       if (k > j + 1 && arr[k] == arr[k - 1])
//                           continue;
//
//                       for (int l = k + 1; l < n; l++) {
//                            if (l > k + 1 && arr[l] == arr[l - 1])
//                                continue;
//
//                            int sum = arr[i] + arr[j] + arr[k] + arr[l];
//
//                            if (sum == key)
//                                result.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k], arr[l])));
//                       }
//                    }
//                }
//            }
//
//            return result;

			ArrayList<ArrayList<Integer>> result = new ArrayList<>();
			int n = arr.length;

			// Sort the array :)
			Arrays.sort(arr);

			for (int i = 0; i < n - 3; i++) {
				// Skip the same values
				if (i > 0 && arr[i] == arr[i - 1])
					continue;

				for (int j = i + 1; j < n - 2; j++) {
					// Skip the same values
					if (j > i + 1 && arr[j] == arr[j - 1])
						continue;

					int l = j + 1;
					int r = n - 1;

					while (l < r) {
						int oldL = 0; // oldLeft
						int oldR = 0; // oldRight

						int sum = arr[i] + arr[j] + arr[l] + arr[r];

						if (sum == key) {
							result.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[l], arr[r])));

							oldL = l;
							oldR = r;

							while (l < r && arr[l] == arr[oldL])
								l++;

							while (l < r && arr[r] == arr[oldR])
								r--;
						} else if (sum < key) {
							l++;
						} else {
							r--;
						}
					}
				}
			}

			return result;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 2, 3, 4, 5, 7, 8 };
		int k = 23;

		Solution solution = new Solution();
		ArrayList<ArrayList<Integer>> result = solution.fourSum(arr, k);

		System.out.println(result);
	}
}
