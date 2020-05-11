package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise06 {

	/**
	 * Exercise 6 Write a program in Java to input 5 numbers from keyboard and find
	 * their sum and average.
	 */
	public static void main(String[] args) {
		int n = 0, s = 0;
		double avg;

		System.out.println("Input the 5 numbers: ");
		
		for (int i = 0; i < 5; i++) {
			Scanner in = new Scanner(System.in);
			n = in.nextInt();

			s += n; // s = s + n

			if (i == 5) {
				in.close();
			}
		}

		avg = s / 5;

		System.out.println("The sum of 5 numbers is: " + s);
		System.out.println("The average is: " + avg);
	}
}