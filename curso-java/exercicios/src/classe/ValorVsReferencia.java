package classe;

public class ValorVsReferencia {
	/**
	 * Pontos Importantes:
	 * 
	 * 1. Sempre que se cria uma variável primitiva e associa essa variável a partir de uma atribuição 
	 * 			para uma outra variável, é realizada uma cópia da mesma; 
	 * 2. Lembre-se: você precisa trabalhar com referência sempre que estiver trabalhando com objetos. 
	 * 			Por exemplo: quando se tem dois objetos apontando para um mesmo espaço de memória, 
	 * 				está sendo atribuída uma referência para ambos os objetos;
	 * 3. Método clone: clona um objeto gerando uma cópia exata do objeto; 
	 * 4. Quando se trabalha com tipos primitivos e é feita uma atribuição por valor, ou seja, uma 
	 * 			cópia do valor é criada na memória de tal forma que se tem dois valores independentes;
	 * 5. Quando se trabalha com objetos, é feita a atribuição por referência, ou seja, quando se pega uma 
	 * 		determinada variável e atribui a partir de outra variável, está sendo feita uma cópia do endereço 
	 * 			da referência na memória, onde, caso haja uma mudança, as duas variáveis perceberão a diferença por se tratar do mesmo objeto.
	 * 
	 */

	public static void main(String[] args) {
		// Atribuição por valor (há uma cópia dos valores, tornando-os independentes)
		double a = 2;
		double b = a;

		a++;
		b--;

		System.out.println(a + " " + b);

		// Atribuição por referência (estão sendo trabalhados os objetos da classe)
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;

		d1.dia = 31;
		d2.mes = 12;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		//Não vai gerar nenhum impacto na geração dos valores
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}