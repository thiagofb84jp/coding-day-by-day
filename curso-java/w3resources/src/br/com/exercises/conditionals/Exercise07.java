package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise07 {

	/**
	 * Exercise 7: Write a program in Java to display n terms of natural numbers and
	 * their sum.
	 */
	public static void main(String[] args) {
		int sum = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");
		int n = in.nextInt();

		System.out.println("The first natural number are: " + n);

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			sum += i;
		}

		System.out.println("The sum of Natural NUmber up to " + n + " terms : " + sum);

		in.close();
	}
}