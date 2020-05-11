package br.com.exercises.arrays;

import java.util.Arrays;

public class Exercise16 {

	public static void main(String[] args) {
		uniqueArray(new int[] { 0, 3, -2, 4, 3, 2 });
		uniqueArray(new int[] { 10, 22, 10, 20, 11, 22 });
	}

	static void uniqueArray(int[] myArray) {
		System.out.println("Original Array : ");

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i] + "\t");
		}

		int noUniqueElements = myArray.length;

		for (int i = 0; i < noUniqueElements; i++) {

			for (int j = i + 1; j < noUniqueElements; j++) {

				if (myArray[i] == myArray[j]) {
					myArray[j] = myArray[noUniqueElements - 1];
					noUniqueElements--; // noUniqueElements = noUniqueElements - 1;
					j--; // j = j - 1;
				}
			}
		}

		int[] array1 = Arrays.copyOf(myArray, noUniqueElements);

		System.out.println();

		System.out.println("Array with unique values : ");

		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i] + "\t");
		}

		System.out.println();
		System.out.println("---------------------------");
	}
}
