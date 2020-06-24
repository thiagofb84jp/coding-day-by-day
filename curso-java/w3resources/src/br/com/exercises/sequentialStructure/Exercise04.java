package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {

	/**
	 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Informe as 4 (quatro) notas: ");
		double nota1 = in.nextDouble();
		double nota2 = in.nextDouble();
		double nota3 = in.nextDouble();
		double nota4 = in.nextDouble();

		double total = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A média final é de: " + total);

		in.close();
	}
}