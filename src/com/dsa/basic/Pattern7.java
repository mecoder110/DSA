package com.dsa.basic;

public class Pattern7 {

	// Function to print pattern7
	public static void pattern7(int n) {

		// Outer loop which will loop for the rows.
		for (int i = 1; i <= n; i++) {

			// Inner loop which loops for the columns.
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
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
		Pattern7 pattern = new Pattern7();

		pattern.pattern7(N);
	}
}
