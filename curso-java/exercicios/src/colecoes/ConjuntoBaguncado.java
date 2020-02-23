package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
	
	/**
	 * Pontos Importantes (Set):
	 * 1. As principais características do Set são:
	 * - Pode ser heterogêneo (essa não é a forma ideal);
	 * - Pode ser homogêneo (é a forma ideal);
	 * - Nao aceita objetos duplicados (não aceita repetições);
	 * - Pode ser ordenado;
	 * - Não é indexado.
	 * 
	 */
	
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); //String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Char
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove('x'));
		System.out.println(conjunto.remove(1));
	}
}