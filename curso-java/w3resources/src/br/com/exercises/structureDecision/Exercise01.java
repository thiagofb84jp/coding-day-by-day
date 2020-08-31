package br.com.exercises.structureDecision;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
	
	/*
	 * Faça um Programa que peça dois números e imprima o maior deles.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.println("Informe o primeiro número: ");
		int num1 = in.nextInt();

		System.out.println("Informe o segundo número: ");
		int num2 = in.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior número é o: " + num1);
		} else {
			System.out.println("O maior número é o: " + num2);
		}
		
		in.close();
	}
}