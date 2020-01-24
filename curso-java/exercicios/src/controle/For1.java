package controle;

public class For1 {

	/**
	 * Pontos Importantes:
	 * 1. 'For' � uma estrutura planejada para que haja uma quantidade determinada 
	 * 		de repeti��es;
	 * 2. Trata-se de uma quantidade pr�-definida de repeti��es.
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
		
		//La�o infinito!
		for (;;) {
			System.out.println("Fim!");
		}
	}
}