package br.com.exercises.structureDecision;

import java.util.Locale;
import java.util.Scanner;

public class Exercise09 {
	
	/*
	 * Faça um Programa que leia três números e mostre-os em ordem decrescente.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.println("Por favor, informe o primeiro número:");
		int num1 = in.nextInt();
		
		System.out.println("Por favor, informe o segundo número:");
		int num2 = in.nextInt();
		
		System.out.println("Por favor, informe o terceiro número:");
		int num3 = in.nextInt();
		
		ordenarNumeros(num1, num2, num3);
		
		in.close();
	}
	
	private static void ordenarNumeros(int num1, int num2, int num3) {
		int aux = 0;
		
		if (num3 > num2) {
			aux = num3;
			num3 = num2;
			num2 = aux;
		}
		
		if (num2 > num1) {
			aux = num2;
			num2 = num1;
			num1 = aux;			
		}
		
		if (num3 > num2) {
			aux = num3;
			num3 = num2;
			num2 = aux;			
		}
		
		System.out.println("Os números na ordem são: " + num1 + " " + num2 + " " + num3);
	}
}