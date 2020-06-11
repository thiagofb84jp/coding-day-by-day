package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise13 {

	/**
	 * Write a program in Java to display the cube of the number upto given an
	 * integer.
	 */
	public static void main(String[] args) {
		System.out.println("Input number of terms: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Number is : " + i + " and cube of " + i + " is: " + (i * i * i));
		}

		in.close();
	}
}
