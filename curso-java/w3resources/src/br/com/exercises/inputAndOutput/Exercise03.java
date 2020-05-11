package br.com.exercises.inputAndOutput;

import java.io.File;

public class Exercise03 {

	public static void main(String[] args) {
		File myFileDir = new File("/home/thiagobarbosa/temp/");
		
		if (myFileDir.exists()) {
			System.out.println("The directory or file exists\n");
		} else {
			System.out.println("The directory or file does not exist.\n");
		}
	}
}