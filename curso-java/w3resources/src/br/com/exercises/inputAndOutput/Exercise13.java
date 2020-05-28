package br.com.exercises.inputAndOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exercise13 {

	public static void main(String[] args) {
		String fileName = "C:\\coding-day-by-day\\curso-java\\anexos\\file.txt";
		InputStream fins = null;

		try {
			fins = new FileInputStream(fileName);
			byte fileContent[] = new byte[2 * 1024];
			int readCount = 0;

			while ((readCount = fins.read(fileContent)) > 0) {
				System.out.println(new String(fileContent, 0, readCount - 1));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fins != null) {
					fins.close();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		}
	}
}
