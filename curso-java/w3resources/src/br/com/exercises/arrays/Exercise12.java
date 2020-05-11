package br.com.exercises.arrays;

public class Exercise12 {
	/**
	 * Write a Java program to find the duplicate values of an array of integer
	 * values.
	 */
	public static void main(String[] args) {
		int[] myArray = { 1, 2, 5, 5, 6, 6, 7, 2 };

		for (int i = 0; i < myArray.length - 1; i++) {

			for (int j = i + 1; j < myArray.length; j++) {
				if ((myArray[i] == myArray[j]) && (i != j)) {
					System.out.println("Duplicate Element: " + myArray[j]);
				}
			}
		}
	}
}