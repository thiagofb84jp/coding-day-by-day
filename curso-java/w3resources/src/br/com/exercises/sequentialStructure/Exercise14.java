package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise14 {
	
	/*
	 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o...
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Informe o peso dos peixes: ");
		int peso = in.nextInt();
		
		if (peso > 50) {
			int excesso = peso - 50;
			int multa = excesso * 4;
			
			System.out.println("Total de excesso: " + excesso);
			System.out.println("Total da multa: " + multa);
		} else {
			System.out.println("Não será preciso pagar nenhuma multa.");
		}
		
		in.close();
	}
}