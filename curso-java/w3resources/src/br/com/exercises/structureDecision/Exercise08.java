package br.com.exercises.structureDecision;

import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {
	
	/*
	 * Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.println("Por favor, informe o preço do primeiro produto:");
		double precoItem1 = in.nextDouble();
		
		System.out.println("Por favor, informe o preço do segundo produto:");
		double precoItem2 = in.nextDouble();
		
		System.out.println("Por favor, informe o preço do terceiro produto:");
		double precoItem3 = in.nextDouble();
		
		menorPreco(precoItem1, precoItem2, precoItem3);
		
		in.close();
	}
	
	private static void menorPreco(double precoItem1, double precoItem2, double precoItem3) {
		if ((precoItem1 < precoItem2) && (precoItem1 < precoItem3)) {
			System.out.println(precoItem1 + " é o preço mais barato.");
		} else if ((precoItem2 < precoItem1) && (precoItem2 < precoItem3)) {
			System.out.println(precoItem2 + " é o preço mais barato.");
		} else {
			System.out.println(precoItem3 + " é o preço mais barato.");
		}
	}
}