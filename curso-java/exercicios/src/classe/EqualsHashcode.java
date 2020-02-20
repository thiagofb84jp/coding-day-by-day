package classe;

public class EqualsHashcode {
	
	public static void main(String[] args) {
		//FORMATAR OS PONTOS IMPORTANTES NA SEMANA QUE VEM
		//A função 'equals' define a igualdade entre dois objetos; por padrão, ele possui o mesmo comportamento de comparar (==) dois tipos primitivos, por exemplo, desconsiderando endereços de memória;
		//Hashcode é útil para busca de elementos dentro de uma listas, conjuntos, maps, entre outros;
		//O 'Hashcode' é uma função que retorna um valor inteiro. O 'Equals' é uma função na qual retorna um valor verdadeiro ou falso (um valor do tipo boolean);
		//O 'Equals' é muito mais lento se comparado ao 'Hashcode'. O 'Hashcode' é muito mais rápido, realizando a separação dos métodos que não são iguais, para retornar apenas os objetos que tem a possibilidade de serem iguais. Ele captura, inicialmente, um subconjunto de elementos, para só depois, realizar o comparativo;
	}
}