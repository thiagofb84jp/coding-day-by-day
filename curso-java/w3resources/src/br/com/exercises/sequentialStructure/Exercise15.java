package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise15 {

	/*
	 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Informe a quantidade de litros necessários para pintar: ");
		double metros = in.nextDouble();

		double litros = metros / 3;

		double precoLitro = 80.00;
		double capacidadeLitro = 18;

		double qtdLatas = litros / capacidadeLitro;
		double total = qtdLatas * precoLitro;

		System.out.println("Você precisará usar o total de " + qtdLatas + " latas de tinta.");
		System.out.println("O preço total é de R$ " + total);

		in.close();
	}
}