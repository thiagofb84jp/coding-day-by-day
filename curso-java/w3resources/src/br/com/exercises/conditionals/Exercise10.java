package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise10 {

	/**
	 * Exercise 10: Write a Java program to solve quadratic equations (use if, else
	 * if and else).
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input a: ");
		double a = in.nextDouble();

		System.out.println("Input b: ");
		double b = in.nextDouble();

		System.out.println("Input c: ");
		double c = in.nextDouble();

		double result = b * b - 4.0 * a * c;

		if (result > 0.0) {
			double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
			double r2 = (-b + Math.pow(result, 0.5)) / (2.0 * a);

			System.out.println("The roots are " + r1 + " and " + r2);
		} else if (result == 0.0) {
			double r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		} else {
			System.out.println("The equation has no real roots.");
		}

		in.close();
	}
}