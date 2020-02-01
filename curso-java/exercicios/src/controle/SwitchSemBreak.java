package controle;

public class SwitchSemBreak {
	/**
	 * Pontos Importantes:
	 * 1. Quando n�o se tem o 'break' (comando), quando um case � executado sem ele, os comandos 
	 *		subsequentes tamb�m ser�o executados;
	 * 2. O 'switch' recebe uma express�o que n�o � nem verdadeiro nem falso, mas sim o pr�prio valor;
	 */

	public static void main(String[] args) {
		String faixa = "marrom";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("N�o sei de nada...");
		}
		
		System.out.println("Fim");
		
		int idade = 3;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
	}
}