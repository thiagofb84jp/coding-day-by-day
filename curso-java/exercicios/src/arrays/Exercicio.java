package arrays;

import java.util.Arrays;

public class Exercicio {
	/**
	 * Pontos Importantes:
	 * 1. Array possui duas características marcantes: 1) Trata-se de uma estrutura estática, com tamanho fixo, ou seja, uma vez criado, é preciso informar quantos valores serão armazenados nele; 2) Array é homogêneo, ou seja, uma 
	 * 		vez que for criado uma Array cujo tipo são inteiros, TODOS os dados do Array obrigatoriamente serão inteiros;
	   2. Ele NUNCA vai mudar de tamanho. Pode-se mudar a referência da variável, mas seu tamanho JAMAIS vai mudar;
	   3. Ele é uma estrutura indexada, ou seja, para acessar seus elementos, é preciso informar o valor numérico (tam - 1 => tamanho menos hum);
	   4. Ele é um objeto, ou seja, tem-se atributos e comportamentos associados ao Array;
	   5. Uma matriz, na realidade, se trata de um Array dentro de outro;
	   6. Caso tente acessar um elemento do array que não existe, o Java lançará uma exceção.
	 */
	
	public static void main(String[] args) {
		//Caso mais usado na construção do Array
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]); //Pegando a primeira nota do Array
		System.out.println(notasAlunoA.length - 1); //Pegando a última nota do Array
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		//Caso menos usado para usar o Array
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10};
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}