package br.com.exercises.structureDecision;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {
	
	/*
	 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.println("Por favor, digite uma letra (F ou M):");
		String letra = in.next();
		
		if (letra.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		} else if (letra.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
		} else {
			System.out.println("Sexo Inválido");
		}
		
		in.close();
	}
}