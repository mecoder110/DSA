package com.dsa.random;

import java.util.Arrays;

public class RearrangeAtjecentSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1,1,1,2,2,2,3,3,3 };

		int[] res = reArrangeAtjecent(arr);
		System.out.println(Arrays.toString(res));

		xyz(1);

	}

	private static void xyz(char c) {
		System.out.println("char");

	}

	private static void xyz(int c) {
		System.out.println("int");

	}

	private static int[] reArrangeAtjecent(int[] arr) {

		int n = arr.length;

		int i = 0;
		// int j=i+1;
		while (i < n - 1) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
			i += 2;
		}

		return arr;
	}

}
