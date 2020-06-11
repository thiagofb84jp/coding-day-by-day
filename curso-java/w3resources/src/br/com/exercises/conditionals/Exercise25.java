package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise25 {
	/**
	 * Write a java program to display the number rhombus structure.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the number : ");
		int n = in.nextInt();
		int count = 1;
		int numberOfSpaces = 1;
		int start = 0;

		for (int i = 1; i < (n * 2); i++) {
			for (int spc = n - numberOfSpaces; spc > 0; spc--) {
				System.out.print(" ");
			}
			if (i < n) {
				start = i;
				numberOfSpaces++;
			} else {
				start = n * 2 - i;
				numberOfSpaces--;
			}
			for (int j = 0; j < count; j++) {
				System.out.print(start);
				if (j < count / 2) {
					start--;
				} else {
					start++;
				}
			}
			if (i < n) {
				count = count + 2;
			} else {
				count = count - 2;
			}
			System.out.println();
		}
		in.close();
	}
}
