package classe;

public class Produto {
	//Atributos
	String nome;
	double preco;
	double desconto;
	
	//Construtor Padr�o (n�o necessita de par�metros pr�vios)
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
	
	//M�todos
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente){
		return preco * (1 - desconto + descontoDoGerente);
	}
}