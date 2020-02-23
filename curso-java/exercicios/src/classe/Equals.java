package classe;

import java.util.Date;

public class Equals {
	/**
	 * Pontos Importantes:
	 * 1. A fun��o 'equals' define a igualdade entre dois objetos; por padr�o, ele possui o mesmo comportamento de 
	 * 		comparar (==) dois tipos primitivos, por exemplo, desconsiderando endere�os de mem�ria;
	 * 2. Hashcode � �til para busca de elementos dentro de uma listas, conjuntos, maps, entre outros;
	 * 3. O 'Hashcode' � uma fun��o que retorna um valor inteiro. O 'Equals' � uma fun��o na qual retorna um valor 
	 * 		verdadeiro ou falso (um valor do tipo boolean);
	 * 4. O 'Equals' � muito mais lento se comparado ao 'Hashcode'. O 'Hashcode' � muito mais r�pido, realizando a 
	 * 		separa��o dos m�todos que n�o s�o iguais, para retornar apenas os objetos que tem a possibilidade 
	 * 		de serem iguais. Ele captura, inicialmente, um subconjunto de elementos, para s� depois, 
	 * 		realizar o comparativo;
	 * 5. O Eclipse possui uma op��o para gerar, de forma autom�tica, o HashCode e o Equals;
	 */
	
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		//Foi implementado um m�todo para realizar o comparativo. Ap�s isso, o pen�ltimo e o �ltimo valor foi dado como 'true'
		System.out.println(u1 == u2); //false (h� a compara�  �o por endere�o de mem�ria)
		System.out.println(u1.equals(u2)); //false (realiza a mesma fun��o do 'equals' (==))
		System.out.println(u2.equals(u1)); //false

		System.out.println(u2.equals(new Date())); //false
	}
}