package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise13 {
	
	/*
	 * Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Informe a altura: ");
		double altura = in.nextDouble();
		
		double pesoIdealHomem = (72.7 * altura) - 58;
		double pesoIdealMulher = (62.1 * altura) - 44.7;
		
		System.out.println("O peso ideal para um homem é de: " + pesoIdealHomem);
		System.out.println("O peso ideal para um homem é de: " + pesoIdealMulher);
		
		in.close();
	}
}