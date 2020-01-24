package controle;

public class For1 {

	/**
	 * Pontos Importantes:
	 * 1. 'For' é uma estrutura planejada para que haja uma quantidade determinada 
	 * 		de repetições;
	 * 2. Trata-se de uma quantidade pré-definida de repetições.
	 */
	public static void main(String[] args) {
		/*int contador = 1;

		while (contador <= 10) {
			System.out.printf("i = %d\n", contador);
			contador++;
		}*/
		
		for (int contador = 0; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		
		int x = 2;
		for (;x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		//Laço infinito!
		for (;;) {
			System.out.println("Fim!");
		}
	}
}