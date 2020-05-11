package br.com.exercises.inputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise06 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input your name: ");

		String name = reader.readLine();

		System.out.println("Your name is: " + name);
	}
}