package classe;

public class Produto {
	//Atributos
	String nome;
	double preco;
	double desconto;
	
	//Construtor Padrão (não necessita de parâmetros prévios)
	Produto(){
		
	}
	
	//Construtores Alternativo
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	//Métodos
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente){
		return preco * (1 - desconto + descontoDoGerente);
	}
}