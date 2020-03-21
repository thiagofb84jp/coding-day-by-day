package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	/**
	 * Uma compra possui uma lista de itens (um ou mais itens);
	 */
	final List<Item> itens = new ArrayList<Item>();

	void adicionarItem(Produto produto, int quantidade) {
		this.itens.add(new Item(produto, quantidade));
	}

	void adicionarItem(String nome, double preco, int quantidade) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}

		return total;
	}
}