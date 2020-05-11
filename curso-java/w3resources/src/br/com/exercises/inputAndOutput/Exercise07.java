package br.com.exercises.inputAndOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise07 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = null;

		String strLine = "";

		try {
			bufferedReader = new BufferedReader(new FileReader("/home/thiagobarbosa/temp/test.txt"));

			while ((strLine = bufferedReader.readLine()) != null) {
				System.out.println(strLine);
			}

			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Unable to read the file");
		}
	}
}