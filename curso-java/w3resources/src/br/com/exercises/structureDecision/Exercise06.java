package br.com.exercises.structureDecision;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
	
	/*
	 * Faça um Programa que leia três números e mostre o maior deles. 
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
		
		
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " é maior que os números " + num2 + " e " + num3);
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " é maior que os números " + num1 + " e " + num3);
		} else {
			System.out.println(num3 + " é maior que os números " + num1 + " e " + num2);
		}
		
		in.close();
	}
}