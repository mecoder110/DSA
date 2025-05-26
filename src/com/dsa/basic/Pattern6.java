package com.dsa.basic;

public class Pattern6 {

	// Function to print pattern6
	public static void pattern6(int n) {

		// Outer loop which will loop for the rows.
		for (int i = 0; i < n; i++) {

			// Inner loop which loops for the columns.
			for (int j = 0; j < n - i; j++) {
				System.out.print(j + 1);
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
		Pattern6 pattern = new Pattern6();

		pattern.pattern6(N);
	}
}
