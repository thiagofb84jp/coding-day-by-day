package br.com.exercises.sequentialStructure;

import java.util.Scanner;

public class Exercise02 {

	/**
	 * Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int numero = in.nextInt();

		System.out.println("O número informado foi: " + numero);
		in.close();
	}
}
