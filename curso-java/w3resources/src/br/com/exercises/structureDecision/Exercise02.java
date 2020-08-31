package br.com.exercises.structureDecision;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {
	
	/*
	 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.println("Informe o valor: ");
		int valor = in.nextInt();
		
		if (valor > 0) {
			System.out.println("O número é positivo");
		} else {
			System.out.println("O número é negativo");
		}
		
		in.close();
	}
}