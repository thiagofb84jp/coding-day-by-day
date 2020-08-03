package br.com.exercises.sequentialStructure;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {

	/*
	 * Faça um Programa que peça 2 números inteiros e um número real. Calcule e
	 * mostre:
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		NumberFormat format = new DecimalFormat("#0,00");

		System.out.print("Digite o primeiro valor (Inteiro): ");
		int value1 = in.nextInt();

		System.out.print("Digite o segundo valor (Inteiro): ");
		int value2 = in.nextInt();

		System.out.println("Digite o terceiro valor (Real): ");
		double value3 = in.nextDouble();

		int firstOperation = (value1 * 2) * (value2 / 2);
		int secondOperation = (int) ((value1 * 3) + value3);
		double thirdOperation = (value3 * value3 * value3);

		System.out.println("******** Many Operations ********");
		System.out.println("1) o produto do dobro do primeiro com metade do segundo: " + firstOperation);
		System.out.println("2) a soma do triplo do primeiro com o terceiro: " + secondOperation);
		System.out.println("3) o terceiro elevado ao cubo: " + format.format(thirdOperation));
	}
}