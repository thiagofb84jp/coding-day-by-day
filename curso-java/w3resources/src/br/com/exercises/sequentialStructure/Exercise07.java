package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {
	/**
	 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro
	 * desta área para o usuário.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Informe a altura do quadrado em metros: ");
		double altura = in.nextDouble();

		System.out.print("Informe a largura do quadrado em metros: ");
		double largura = in.nextDouble();

		double area = altura * largura;

		System.out.println("O valor da área é de: " + area + " m²");

		double dobroArea = area * 2;

		System.out.println("O dobro da área é de: " + dobroArea + " m²");

		in.close();
	}
}