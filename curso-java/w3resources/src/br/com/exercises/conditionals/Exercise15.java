package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise15 {
	/**
	 * Write a program in Java to display the multiplication table of a given
	 * integer.
	 */
	public static void main(String[] args) {
		System.out.print("Input the number (Table to be calculated):");
		System.out.print("Input the number of terms:");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println("\n");
		for (int i = 0; i <= n; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}

		in.close();
	}
}