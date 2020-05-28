package br.com.exercises.inputAndOutput;

import java.io.File;

public class Exercise11 {
	
	public static void main(String[] args) {
		File file = new File("C:\\coding-day-by-day\\curso-java\\anexos\\file.txt");
		
		if (file.exists()) {
			System.out.println(fileSizeInBytes(file));
			System.out.println(fileSizeInKilobytes(file));
			System.out.println(fileSizeInMegabytes(file));
		} else {
			System.out.println("File doesn't exist!");
		}
	}

	private static String fileSizeInMegabytes(File file) {
		return file.length() / (1024 * 1024) + " mb";
	}

	private static String fileSizeInKilobytes(File file) {
		return file.length() / (1024) + " kb";
	}

	private static String fileSizeInBytes(File file) {
		return file.length() + " bytes";
	}
}