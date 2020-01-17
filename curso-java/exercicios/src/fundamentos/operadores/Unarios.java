package fundamentos.operadores;

public class Unarios {
	/**
	 * Pontos Importantes:
	 * 1. Formas de apresentação dos operadores unários: pré-fixada e pós-fixada;
	 * 2. Procure escrever códigos simples (sempre!).
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
		 * Caso seja colocado o operador unário antes da variável, isso significa dizer que:
		 * ++a -> Mais pressa
		 * b-- -> Menos pressa
		 * No momento da execução da operação, quem tem mais pressa prevalece
		 */
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == --b); //Trecho de código no qual gera mais confusão do que entendimento
		System.out.println(a);
		System.out.println(b);
	}
}