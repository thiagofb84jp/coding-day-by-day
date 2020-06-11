package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise22 {
	/**
	 * Write a program in Java to print the Floyd's Triangle.
	 * 
	 */
	public static void main(String[] args) {
		int p, q;

		System.out.print("Input number of rows : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				p = 1;
				q = 0;
			} else {
				p = 0;
				q = 1;
			}

			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(p);
				} else {
					System.out.print(q);
				}
			}
			System.out.println("");
		}
		in.close();
	}
}