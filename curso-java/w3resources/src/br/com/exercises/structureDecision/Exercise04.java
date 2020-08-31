package br.com.exercises.structureDecision;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {
	
	/*
	 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.println("Por favor, digite uma letra:");
		String letra = in.next();

		if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O")
				|| letra.equalsIgnoreCase("U")) {
			System.out.println("A letra informada é uma vogal.");
		} else {
			System.out.println("A letra informada é uma consoante.");
		}
		
		in.close();
	}	
}