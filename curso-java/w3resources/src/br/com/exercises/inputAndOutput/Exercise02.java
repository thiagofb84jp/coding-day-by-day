package br.com.exercises.inputAndOutput;

import java.io.File;
import java.io.FilenameFilter;

public class Exercise02 {

	/**
	 * Exericise 02 Write a Java program to get specific files by extensions from a
	 * specified folder.
	 */
	public static void main(String[] args) {
		String pathName = "/home/thiagobarbosa/coding-day-by-day";

		File file = new File(pathName);
		String[] list = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".json")) {
					return true;
				} else {
					return false;
				}
			}
		});

		for (String f : list) {
			System.out.println(f);
		}
	}
}
