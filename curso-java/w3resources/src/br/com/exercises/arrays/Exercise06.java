package br.com.exercises.arrays;

public class Exercise06 {

	/**
	 * Write a Java program to find the index of an array element.
	 */

	public static void main(String[] args) {
		int[] myArray = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println("Index position of 25 is : " + findIndex(myArray, 25));
		System.out.println("Index position of 77 is : " + findIndex(myArray, 77));
	}

	static int findIndex(int[] myArray, int t) {
		if (myArray == null) {
			return -1;
		}

		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] == t) {
				return i;
			}
		}
		return -1;
	}
}