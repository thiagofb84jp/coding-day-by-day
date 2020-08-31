package br.com.exercises.structureDecision;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
	
	/*
	 * Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.println("Por favor, informe a primeira nota:");
		double nota1 = in.nextDouble();
		
		System.out.println("Por favor, informe a primeira nota:");
		double nota2 = in.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção.");
		} else if (media >= 7) {
			System.out.println("Aprovado.");
		} else if (media < 7) {
			System.out.println("Reprovado.");
		}		
		
		in.close();
	}
}