package br.com.exercises.inputAndOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise10 {

	public static void main(String[] args) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		String strLine = "";

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/thiagobarbosa/temp/test.txt"));

			while (strLine != null) {
				stringBuilder.append(strLine);
				stringBuilder.append(System.lineSeparator());
				strLine = bufferedReader.readLine();
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