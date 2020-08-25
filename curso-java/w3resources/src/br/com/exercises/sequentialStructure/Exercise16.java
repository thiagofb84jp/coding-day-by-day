package br.com.exercises.sequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise16 {
	
	/*
	 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.US);

		System.out.print("Informe o valor da hora trabalhada: ");
		double qtdValorHora = in.nextDouble();

		System.out.print("Informe a quantidade de horas trabalhadas: ");
		double horasTrabalhadas = in.nextDouble();
		
		double salarioBruto = qtdValorHora * horasTrabalhadas;
		
		double impostoRenda = 0.11 * salarioBruto;
		double inss = 0.08 * salarioBruto;
		double sindicato = 0.05 * salarioBruto;
		
		double valorTotal = impostoRenda + inss + sindicato;
		double salarioLiquido = salarioBruto - valorTotal;
		
		System.out.println("\n************ Cálculo do Salário ************");
		System.out.println("Seu salário bruto é de: " + salarioBruto);
		System.out.println("Seu salário líquido é de: " + salarioLiquido);
		
		System.out.println("\n************ Valor dos Impostos ************");
		System.out.println("Imposto de Renda: " + impostoRenda);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		
		in.close();
	}
}