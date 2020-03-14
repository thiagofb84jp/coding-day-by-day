package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	/**
	 * Pontos Importantes:
	 * 1. N�o h� problemas em rela��o a usar mais de uma vez a fun��o poll(); 
	 * 
	 */
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> Adicionam elementos na fila
		//Diferen�a � o comportamento ocorre quando a fila est� cheia!
		fila.add("Ana"); //Retorna null
		fila.offer("Bia"); //Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> Obt�m o pr�ximo elemento da fila (sem remover)
		//Diferen�a � o comportamento ocorre quando a fila est� vazia!
		System.out.println(fila.peek()); //Retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); //Lan�a uma exce��o
		System.out.println(fila.element());
		
		// Pool e Remove -> Obt�m o pr�ximo elemento da fila e remove!
		
		// Diferen�a � o comportamento ocorre quando a fila est� vazia!
		System.out.println(fila.poll()); //Retorna null
		System.out.println(fila.remove()); //Lan�a uma exce��o
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