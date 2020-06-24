package br.com.exercises.sequentialStructure;

import java.util.Scanner;

public class Exercise03 {

	/**
	 * Faça um Programa que peça dois números e imprima a soma.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		int number1 = in.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int number2 = in.nextInt();

		int total = number1 + number2;

		System.out.println("A soma total de " + number1 + "+" + number2 + " é igual a " + total);

		in.close();
	}
}