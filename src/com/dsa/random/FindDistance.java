package com.dsa.random;

public class FindDistance {

	public static void main(String[] args) {
		int[] arr = { -2, 2, 2, 5, 6, -2 };

		int res = findDistance(arr);
		System.out.println(res);

	}

	private static int findDistance(int[] arr) {
		int totalSum = 0;
		for (int num : arr) {
			totalSum += num;
		}
		int leftSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int rightSum = totalSum - arr[i] - leftSum;
			if (leftSum == rightSum)
				return i + 1;

			leftSum += arr[i];
		}

		return -1;
	}

}
