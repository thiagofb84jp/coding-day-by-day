package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		Compra compras1 = new Compra();
		compras1.cliente = "Jo�o Pedro";
		compras1.itens.add(new Item("Caneta", 20, 7.45));
		compras1.itens.add(new Item("Borracha", 12, 3.89));
		compras1.itens.add(new Item("Caderno", 3, 18.79));
		
		System.out.println(compras1.itens.size());
	}
}