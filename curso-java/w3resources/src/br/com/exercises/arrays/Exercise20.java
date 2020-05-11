package br.com.exercises.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise20 {

	/**
	 * Write a Java program to convert an array to ArrayList.
	 * 
	 */

	public static void main(String[] args) {
		String[] myArray = new String[] { "Python", "JAVA", "PHP", "Perl", "C#", "C++" };

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(myArray));

		System.out.println(list);
	}
}