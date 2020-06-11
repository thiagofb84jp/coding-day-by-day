package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise23 {
	/**
	 * Write a program in Java to display the pattern like a diamond.
	 */
	public static void main(String[] args) {
		int i, j, r;
		System.out.println("Input the number of rows (half of the diamomd");

		Scanner in = new Scanner(System.in);
		r = in.nextInt();

		for (i = 0; i <= r; i++) {
			for (j = 1; j <= r - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		for (i = r - 1; i >= 1; i--) {
			for (j = 1; j <= r - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		in.close();
	}
}