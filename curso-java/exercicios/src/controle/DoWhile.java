package controle;

import java.util.Scanner;

public class DoWhile {
	/**
	 * Pontos Importantes:
	 * 1. Para criar um template (trechos de código pronto), ir para opção de 'Editor -> Templates'.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		
		entrada.close();
	}
}