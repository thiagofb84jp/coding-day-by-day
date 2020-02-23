package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	
	/**
	 * Pontos Importantes (Set):
	 * 1. As principais caracter�sticas do Set s�o:
	 * - Pode ser heterog�neo (essa n�o � a forma ideal);
	 * - Pode ser homog�neo (� a forma ideal);
	 * - Nao aceita objetos duplicados (n�o aceita repeti��es);
	 * - Pode ser ordenado;
	 * - N�o � indexado.
	 * 
	 */
	
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); //String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Char
		
		System.out.println("Tamanho � " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove('x'));
		System.out.println(conjunto.remove(1));
	}
}