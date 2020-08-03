package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {
	/**
	 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
	 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Informe o valor da hora trabalhada: ");
		double valorHoraTrabalhada = in.nextDouble();

		System.out.print("Informe quantas horas você trabalhou neste mês: ");
		double horasTrabalhadas = in.nextDouble();

		double salarioMes = valorHoraTrabalhada * horasTrabalhadas;

		System.out.println("Você receberá neste mês o valor de R$ " + salarioMes + " reais.");
		
		in.close();
	}
}