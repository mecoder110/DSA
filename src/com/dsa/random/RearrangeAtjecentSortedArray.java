package com.dsa.random;

import java.util.Arrays;

public class RearrangeAtjecentSortedArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int[] res = reArrangeAtjecent(arr);
		System.out.println(Arrays.toString(res));

	}

	private static int[] reArrangeAtjecent(int[] arr) {
		
		int n =arr.length;
		
		int i=0;
		//int j=i+1;
		while(i<n-1) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i+=2;
		}
		
		return arr;
	}

}
