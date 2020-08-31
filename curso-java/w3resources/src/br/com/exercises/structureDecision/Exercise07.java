package br.com.exercises.structureDecision;

import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {
	
	/*
	 * Faça um Programa que leia três números e mostre o maior e o menor deles
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

		maiorNumero(num1, num2, num3);
		
		menorNumero(num1, num2, num3);
		
		in.close();
	}
	
	private static void maiorNumero(int num1, int num2, int num3) {
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " é o maior número");
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " é o maior número");
		} else {
			System.out.println(num3 + " é o maior número");
		}
	}
	
	private static void menorNumero(int num1, int num2, int num3) {
		if ((num1 < num2) && (num1 < num3)) {
			System.out.println(num1 + " é o menor número");
		} else if ((num2 < num1) && (num2 < num3)) {
			System.out.println(num2 + " é o menor número");
		} else {
			System.out.println(num3 + " é o menor número");
		}
	}
}