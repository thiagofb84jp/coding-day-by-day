package fundamentos;

/**
 * 
 * @author Thiago Ferreira
 * Dicas das teclas de atalho: ALT + (seta direcional para cima ou para baixo) = Move as linhas de código
 *
 */
public class Temperatura {
	
	public static void main(String[] args) {
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é: " + celsius + "°C.");
		
		fahrenheit = 212;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é: " + celsius + "°C.");
	}
}