package br.com.exercises.inputAndOutput;

import java.io.File;

public class Exercise01 {

	/**
	 * Exercise 01
	 * Write a Java program to get a list of all file/directory names from the given.
	 */
	public static void main(String[] args) {
		String pathName = "/home/thiagobarbosa/coding-day-by-day";
		
		File file = new File(pathName);
		
		String[] fileList = file.list();

		for (String name : fileList) {
			System.out.println(name);
		}
	}

}
