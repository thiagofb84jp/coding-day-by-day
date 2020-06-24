package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {

	/**
	 * Faça um Programa que converta metros para centímetros.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Informe o valor (Metros -> Centímetros): ");
		double metro = in.nextDouble();

		double centimetro = metro * 100;

		System.out.println(metro + " metro(s) equivale a " + centimetro + " centímetro(s)");
		in.close();
	}

}
