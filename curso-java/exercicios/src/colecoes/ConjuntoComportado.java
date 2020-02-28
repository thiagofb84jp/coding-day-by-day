package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	/**
	 * Pontos Importantes:
	 * - O 'treeSet()' garante a ordem de inserção dos elementos;
	 * - É importante lembrar que todos os dados deste exemplo são do mesmo tipo, ou seja, 
	 * 		caso se tente incluir dados de tipos diferentes, haverá erro de compilação;
	 */
	
	public static void main(String[] args) {
		Set<String> listaAprovados = new HashSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		System.out.println(listaAprovados.toString());
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		SortedSet<String> listaReprovados = new TreeSet<>();
		listaReprovados.add("José");
		listaReprovados.add("João");
		listaReprovados.add("Paulo");
		listaReprovados.add("Patrícia");
		
		System.out.println(listaReprovados.toString());
		
		for (String candidato : listaReprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (int n : nums) {
			System.out.println(n);
		}
	}
}