package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise19 {
	/**
	 * Write a program in Java to display the pattern like right angle triangle with
	 * a number.
	 */
	public static void main(String[] args) {
		System.out.println("Input number of rows:");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

		in.close();
	}
}