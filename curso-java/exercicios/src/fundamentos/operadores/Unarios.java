package fundamentos.operadores;

public class Unarios {
	/**
	 * Pontos Importantes:
	 * 1. Formas de apresenta��o dos operadores un�rios: pr�-fixada e p�s-fixada;
	 * 2. Procure escrever c�digos simples (sempre!).
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		b++; // b = b + 1;
		
		++b; // b = b + 1;
		--b; // b = b + 1;
		
		System.out.println(a);
		System.out.println(b);
		
		/**
		 * Caso seja colocado o operador un�rio antes da vari�vel, isso significa dizer que:
		 * ++a -> Mais pressa
		 * b-- -> Menos pressa
		 * No momento da execu��o da opera��o, quem tem mais pressa prevalece
		 */
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == --b); //Trecho de c�digo no qual gera mais confus�o do que entendimento
		System.out.println(a);
		System.out.println(b);
	}
}