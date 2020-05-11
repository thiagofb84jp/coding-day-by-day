package br.com.exercises.inputAndOutput;

import java.io.File;
import java.io.IOException;

public class Exercise08 {

	public static void main(String[] args) throws IOException {
		File myFileDir = new File("/home/thiagobarbosa/temp/test.txt");

		if (myFileDir.canWrite()) {
			System.out.println(myFileDir.getAbsolutePath() + " can write.\n");
		} else {
			System.out.println(myFileDir.getAbsolutePath() + " cannot write.\n");
		}

		if (myFileDir.canRead()) {
			System.out.println(myFileDir.getAbsolutePath() + " can read.\n");
		} else {
			System.out.println(myFileDir.getAbsolutePath() + " cannot read.\n");
		}

	}
}