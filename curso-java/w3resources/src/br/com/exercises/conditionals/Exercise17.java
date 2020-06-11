package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise17 {
	/**
	 * Write a program in Java to print such pattern like right angle triangle with
	 * number increased by 1
	 */
	public static void main(String[] args) {
		int k = 1;
		System.out.println("Input the number of rows : ");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++);
			}
			System.out.println("");
		}
		in.close();
	}
}