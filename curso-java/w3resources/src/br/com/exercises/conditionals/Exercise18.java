package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise18 {
	/**
	 * Write a program in Java to display the n terms of odd natural number and
	 * their sum.
	 */
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Input number of terms is: ");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println("\nThe odd numbers are : ");

		for (int i = 1; i <= n; i++) {
			System.out.println(2 * i - 1);
			sum += 2 * i - 1;
		}
		System.out.println("The Sum of odd natural number upto " + n + " term is : " + sum);
		
		in.close();
	}
}