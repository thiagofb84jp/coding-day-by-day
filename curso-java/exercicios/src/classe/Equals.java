package classe;

import java.util.Date;

public class Equals {
	/**
	 * Pontos Importantes:
	 * 1. A função 'equals' define a igualdade entre dois objetos; por padrão, ele possui o mesmo comportamento de 
	 * 		comparar (==) dois tipos primitivos, por exemplo, desconsiderando endereços de memória;
	 * 2. Hashcode é útil para busca de elementos dentro de uma listas, conjuntos, maps, entre outros;
	 * 3. O 'Hashcode' é uma função que retorna um valor inteiro. O 'Equals' é uma função na qual retorna um valor 
	 * 		verdadeiro ou falso (um valor do tipo boolean);
	 * 4. O 'Equals' é muito mais lento se comparado ao 'Hashcode'. O 'Hashcode' é muito mais rápido, realizando a 
	 * 		separação dos métodos que não são iguais, para retornar apenas os objetos que tem a possibilidade 
	 * 		de serem iguais. Ele captura, inicialmente, um subconjunto de elementos, para só depois, 
	 * 		realizar o comparativo;
	 * 5. O Eclipse possui uma opção para gerar, de forma automática, o HashCode e o Equals;
	 */
	
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		//Foi implementado um método para realizar o comparativo. Após isso, o penúltimo e o último valor foi dado como 'true'
		System.out.println(u1 == u2); //false (há a comparaç  ão por endereço de memória)
		System.out.println(u1.equals(u2)); //false (realiza a mesma função do 'equals' (==))
		System.out.println(u2.equals(u1)); //false

		System.out.println(u2.equals(new Date())); //false
	}
}