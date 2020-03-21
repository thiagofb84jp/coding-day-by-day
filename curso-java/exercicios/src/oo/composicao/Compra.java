package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	
	ArrayList<Item> itens = new ArrayList<Item>();
	
	/**
	 * Com esse relacionamento, posso referenciar um para muitos
	 */
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	/**
	 * Da mesma forma como no relacionamento anterior, há uma referência de um para muitos
	 * 
	 */
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}