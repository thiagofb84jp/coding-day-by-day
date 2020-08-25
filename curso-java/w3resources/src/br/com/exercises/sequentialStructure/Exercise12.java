package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {

	/**
	 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
	 * calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Digite a sua altura: ");
		double altura = in.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;

		System.out.println("Seu peso ideal é de: " + pesoIdeal);
		
		in.close();
	}
}