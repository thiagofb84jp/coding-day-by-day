package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise20 {
	/**
	 * Write a program in Java to print such pattern like a pyramid with a number
	 * which will repeat the number in the same row.
	 */
	public static void main(String[] args) {
		System.out.println("Input number of rows : ");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int s = n + 4 - 1;

		for (int i = 1; i <= n; i++) {
			for (int j = s; j != 0; j--) {
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print(i + " ");
			}
			System.out.println();
			s--;
		}
		in.close();
	}
}