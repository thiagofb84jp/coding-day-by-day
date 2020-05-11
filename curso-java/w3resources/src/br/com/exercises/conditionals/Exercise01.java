package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise01 {

	/**
	 * Write a Java program to test a number is positive or negative.
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input a number: ");

		int input = in.nextInt();

		if (input > 0) {
			System.out.println("Number is a positive.");
		} else if (input < 0) {
			System.out.println("Number is a negative.");
		} else {
			System.out.println("Number is a zero.");
		}
		
		in.close();
	}
}
