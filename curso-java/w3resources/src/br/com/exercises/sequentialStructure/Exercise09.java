package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise09 {

	/**
	 * Faça um Programa que peça a temperatura em graus Farenheit, transforme e
	 * mostre a temperatura em graus Celsius.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Digite o valor da temperatura (°F): ");
		float farenheit = in.nextFloat();

		float celsius = (farenheit - 32) * 5 / 9;

		System.out.println(farenheit + "°F equivale a " + celsius + "°C");

		in.close();
	}
}