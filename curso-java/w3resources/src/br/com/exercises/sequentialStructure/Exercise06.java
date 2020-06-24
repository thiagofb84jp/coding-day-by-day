package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {

	/**
	 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Informe o raio do círculo: ");
		double raio = in.nextDouble();

		double area = Math.PI * (raio * raio);

		System.out.println("A área do círculo é igual a " + area);
		in.close();
	}
}