package colecoes;

import java.util.HashSet;
import java.util.Set;

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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
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
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //Uni�o entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}