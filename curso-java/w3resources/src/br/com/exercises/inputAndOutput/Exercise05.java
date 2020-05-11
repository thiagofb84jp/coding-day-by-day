package br.com.exercises.inputAndOutput;

import java.io.File;
import java.util.Date;

public class Exercise05 {

	public static void main(String[] args) {
		File file = new File("test.txt");

		Date date = new Date(file.lastModified());

		System.out.println("\nThe file was last modifield on: " + date + "\n");
	}
}