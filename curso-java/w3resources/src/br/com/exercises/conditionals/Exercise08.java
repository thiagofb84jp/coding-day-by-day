package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise08 {

	/**
	 * Exercise 8: Write a Java program that takes a year from user and print
	 * whether that year is a leap year or not.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input the year: ");
		int year = in.nextInt();

		boolean x = (year % 4) == 0;
		boolean y = (year % 100) != 0;
		boolean z = ((year % 100 == 0) && (year % 400 == 0));

		if (x && (y || z)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

		in.close();
	}
}