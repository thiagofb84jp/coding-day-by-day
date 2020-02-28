package colecoes;

import java.util.ArrayList;

public class List {
	
	/**
	 * Pontos Importantes:
	 * 1. Os elementos de uma lista podem ser homo ou heterog�neos;
	 * 2. Eles aceitam objetos duplicados;
	 * 3. S�o ordenados e indexados;
	 * 4. Estruturas do tipo 'HashSet()' e 'HashMap()' utilizar�o o 'HashCode()';
	 */
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); //retornar� o valor "Bia" acessando pelo �ndice
		
		//Sobre remo��o dos elementos de uma lista
		System.out.println(">>>>>> " + lista.remove(3));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		System.out.println("Tem? " + lista.contains(u1));
		
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
	}
}