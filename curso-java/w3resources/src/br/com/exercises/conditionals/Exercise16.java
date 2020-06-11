package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise16 {
	/**
	 * Write a program in Java to print such a pattern like right angle triangle
	 * with a number which will repeat a number in a row.
	 */
	public static void main(String[] args) {
		System.out.println("Input number of n : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		in.close();
	}
}