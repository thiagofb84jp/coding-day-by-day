package br.com.exercises.arrays;

import java.util.Arrays;

public class Exercise18 {

	/**
	 * Write a Java program to find the second smallest element in an array.
	 */
	public static void main(String[] args) {
		int[] myArray = { -1, 4, 0, 2, 7, -3 };

		System.out.println("Original numeric array : " + Arrays.toString(myArray));

		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == min) {
				secondMin = min;
			} else if (myArray[i] < min) {
				secondMin = min;
				min = myArray[i];
			} else if (myArray[i] < secondMin) {
				secondMin = myArray[i];
			}
		}
		System.out.println("Second lowest number is: " + secondMin);
	}
}