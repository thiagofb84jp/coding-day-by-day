package arrays;

import java.util.Arrays;

public class Exercicio {
	/**
	 * Pontos Importantes:
	 * 1. Array possui duas caracter�sticas marcantes: 1) Trata-se de uma estrutura est�tica, com tamanho fixo, ou seja, uma vez criado, � preciso informar quantos valores ser�o armazenados nele; 2) Array � homog�neo, ou seja, uma 
	 * 		vez que for criado uma Array cujo tipo s�o inteiros, TODOS os dados do Array obrigatoriamente ser�o inteiros;
	   2. Ele NUNCA vai mudar de tamanho. Pode-se mudar a refer�ncia da vari�vel, mas seu tamanho JAMAIS vai mudar;
	   3. Ele � uma estrutura indexada, ou seja, para acessar seus elementos, � preciso informar o valor num�rico (tam - 1 => tamanho menos hum);
	   4. Ele � um objeto, ou seja, tem-se atributos e comportamentos associados ao Array;
	   5. Uma matriz, na realidade, se trata de um Array dentro de outro;
	   6. Caso tente acessar um elemento do array que n�o existe, o Java lan�ar� uma exce��o.
	 */
	
	public static void main(String[] args) {
		//Caso mais usado na constru��o do Array
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]); //Pegando a primeira nota do Array
		System.out.println(notasAlunoA.length - 1); //Pegando a �ltima nota do Array
		
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