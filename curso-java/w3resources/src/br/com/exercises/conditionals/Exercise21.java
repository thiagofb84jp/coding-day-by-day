package br.com.exercises.conditionals;

import java.util.Scanner;

public class Exercise21 {
	/**
	 * Write a java program to generate a following *'s triangle.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Input the number : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = n; i > 0; i--) {
			for(int spc = n - i; spc > 0; spc--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		in.close();
	}
}