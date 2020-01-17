package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	/**
	 * Pontos Importantes:
	 * 1. A melhor compara��o entre Strings � usando o m�todo da classe, o .equals();
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("2" == "2"); //true
		
		String s = new String("2");
		System.out.println("2" == s); //false
		System.out.println("2".equals(s)); //Melhor forma para realizar compara��o entre Strrings
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); //Ele retira todos os espa�os em branco
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}