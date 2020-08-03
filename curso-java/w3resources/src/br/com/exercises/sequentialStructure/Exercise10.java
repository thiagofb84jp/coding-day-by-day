package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
	/**
	 * Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre
	 * em graus Farenheit.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Digite o valor da temperatura (°C): ");
		float celsius = in.nextFloat();

		float farenheit = (celsius * 9 / 5) + 32;

		System.out.println(celsius + "°C equivale a " + farenheit + "°F");

		in.close();
	}
}