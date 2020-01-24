package controle;

public class For3 {

	public static void main(String[] args) {
		/**
		 * Pontos Importantes:
		 * 1. Dependendo de onde a variável for declarada, ela pode estar disponível dentro ou fora do laço
		 * 		da estrutura de repetição;
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		int i = 0;
		System.out.println("Saiu do primeiro for...");
		System.out.println(i);
		
		System.out.println("Entrando no segundo for...");
		
		for (int j = 0; j < 10; j++) {
			for (int k = 0; k < 10; k++) {
				System.out.printf("[%d %d]", j, k);
			}
			System.out.println();
		}
	}
}