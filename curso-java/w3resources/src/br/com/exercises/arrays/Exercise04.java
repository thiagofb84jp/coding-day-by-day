package br.com.exercises.arrays;

public class Exercise04 {
	/**
	 * Write a Java program to calculate the average value of array elements.
	 */

	public static void main(String[] args) {
		int myArray[] = { 20, 30, 25, 35, -16, 60, -100 };
		int sum = 0;

		for (int i : myArray) {
			sum += i; // sum = sum + i
		}

		double average = sum / myArray.length;
		
		System.out.println("The sum is : " + sum);
		System.out.println("The average value of the array elements is : " + average);
	}
}