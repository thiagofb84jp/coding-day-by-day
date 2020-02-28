package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	/**
	 * Pontos Importantes:
	 * - O 'treeSet()' garante a ordem de inser��o dos elementos;
	 * - � importante lembrar que todos os dados deste exemplo s�o do mesmo tipo, ou seja, 
	 * 		caso se tente incluir dados de tipos diferentes, haver� erro de compila��o;
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
		listaReprovados.add("Jos�");
		listaReprovados.add("Jo�o");
		listaReprovados.add("Paulo");
		listaReprovados.add("Patr�cia");
		
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