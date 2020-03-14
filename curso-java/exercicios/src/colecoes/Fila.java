package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	/**
	 * Pontos Importantes:
	 * 1. Não há problemas em relação a usar mais de uma vez a função poll(); 
	 * 
	 */
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila
		//Diferença é o comportamento ocorre quando a fila está cheia!
		fila.add("Ana"); //Retorna null
		fila.offer("Bia"); //Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> Obtém o próximo elemento da fila (sem remover)
		//Diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.peek()); //Retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); //Lança uma exceção
		System.out.println(fila.element());
		
		// Pool e Remove -> Obtém o próximo elemento da fila e remove!
		
		// Diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.poll()); //Retorna null
		System.out.println(fila.remove()); //Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());

		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
	}
}