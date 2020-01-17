package fundamentos.operadores;

public class Atribuicao {
	/**
	 * Pontos Importantes:
	 * 1. Operadores de atribuição são formas reduzidas de realizar atribuições 
	 * em cima dos valores.
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; //c = c * b;
		c /= a; // c = c / a;
		
		System.out.println(c);
		
		c %= 2; // c = c % 2; -> O resultado será 0 (zero) ou 1 (hum)
		System.out.println(c);
		
	}
}