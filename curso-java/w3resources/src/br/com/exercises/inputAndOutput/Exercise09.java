package br.com.exercises.inputAndOutput;

import java.io.File;
import java.io.IOException;

public class Exercise09 {

	public static void main(String[] args) throws IOException {
		File myFileDir = new File("/home/thiagobarbosa/temp/test.txt");

		if (myFileDir.isDirectory()) {
			System.out.println(myFileDir.getAbsolutePath() + " is a directory.\n");
		} else {
			System.out.println(myFileDir.getAbsolutePath() + " is not a directory.\n");
		}

		if (myFileDir.isFile()) {
			System.out.println(myFileDir.getAbsolutePath() + " is a file.\n");
		} else {
			System.out.println(myFileDir.getAbsolutePath() + " is not a file.\n");
		}
	}
}