package com.dsa.basic;

public class Pattern5 {

	public static void pattern5(int n) {

		// Outer loop which will loop for the rows.
		for (int i = 0; i < n; i++) {

			// Inner loop which loops for the columns.
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			/*
			 * As soon as stars for each iteration are printed, move to the next row and
			 * give a line break
			 */
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int N = 5;

		// Create an instance of the Pattern class
		Pattern5 pattern = new Pattern5();

		pattern.pattern5(N);
	}
}
