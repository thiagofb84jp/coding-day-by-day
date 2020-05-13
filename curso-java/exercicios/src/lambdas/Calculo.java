package lambdas;

@FunctionalInterface
public interface Calculo {
	/**
	 * - A interface funcional pode ter apenas UM �nico m�todo dentro do seu corpo;
	 * - Essas interfaces nos auxiliam a criar as fun��es lambdas;
	 * - A @FunctionalInterface se trata de uma anota��o de valida��o. Caso esta anota��o
	 * 		n�o surja, ele n�o reconhecer� as outras lambdas contidas no c�digo;
	 * - Pode-se deixar outros m�todos dentro da interface funcional (vide exemplos);
	 */

	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
}