package br.com.exercises.inputAndOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise12 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		String strLine = "";
		String strData = "";

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\coding-day-by-day\\curso-java\\anexos\\file.txt"));

			while (strLine != null) {
				if (strLine == null)
					break;
				
				strData += strLine;
				strLine = bufferedReader.readLine();
			}

			System.out.println(strData);
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
		} catch (IOException e) {
			System.err.println("Unable to read the file.");
		}

	}
}
