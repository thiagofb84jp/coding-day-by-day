package br.com.exercises.arrays;

import java.util.Arrays;

public class Exercise17 {

	/**
	 * Write a Java program to find the second largest element in an array.
	 * 
	 */

	public static void main(String[] args) {
		int[] myArray = { 10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };

		System.out.println("Original numeric array : " + Arrays.toString(myArray));

		Arrays.sort(myArray);
		
		int index = myArray.length - 1;

		while (myArray[index] == myArray[myArray.length - 1]) {
			index--;
		}

		System.out.println("Second largest value : " + myArray[index]);
	}
}
