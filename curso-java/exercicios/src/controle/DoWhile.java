package controle;

import java.util.Scanner;

public class DoWhile {
	/**
	 * Pontos Importantes:
	 * 1. Para criar um template (trechos de c�digo pronto), ir para op��o de 'Editor -> Templates'.
	 */
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		
		String texto = "";
		
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.println("Quer sair?");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		
		entrada.close();
	}
}