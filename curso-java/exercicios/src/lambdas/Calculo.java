package lambdas;

@FunctionalInterface
public interface Calculo {
	/**
	 * - A interface funcional pode ter apenas UM único método dentro do seu corpo;
	 * - Essas interfaces nos auxiliam a criar as funções lambdas;
	 * - A @FunctionalInterface se trata de uma anotação de validação. Caso esta anotação
	 * 		não surja, ele não reconhecerá as outras lambdas contidas no código;
	 * - Pode-se deixar outros métodos dentro da interface funcional (vide exemplos);
	 */

	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
}