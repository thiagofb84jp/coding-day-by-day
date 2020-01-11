package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Good");
		System.out.print(" Morning!\n ");
		
		System.out.println("Good");
		System.out.println(" Moring!");
		
		System.out.printf("Megasena Numbers: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
	}
}