package classe;

public class Produto {
	// Atributos
	String nome;
	double preco;
	static double desconto = 0.25;

	// Construtor Padr�o (n�o necessita de par�metros pr�vios)
	Produto() {

	}

	// Construtores Alternativo
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	// Métodos
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}