package classe;

public class Data {
	
	/**
	 * 1) Usa-se o 'this' para:
	 * -> Como método;
	 * -> Para referenciar o objeto atual;
	 * -> Parâmetros com os mesmos nomes dos atributos de instância;
	 * -> Para acessar um método que pertence a uma instância;
	 * -> Para acessar os atributos.
	 * 2) Uma variável local não é inicializada por padrão. Variáveis definidas diretamente no corpo da classe,
	 * fora dos métodos, serão inicializadas por padrão;	
	 */
	
	int dia;
	int mes;
	int ano;
	
	//O que vai definir qual construtor será chamado é a quantidade e a ordem dos parâmetros
	//Sempre que se usa o 'this' como método, significa dizer que está chamando o construtor
	//Não se usa o 'this' com um método que não é um construtor
	Data(){
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970);
		
		//Objetos -> null;
		String s = null;
		System.out.println(s);
		
		//As variáveis locais precisam ser inicializadas
		int a = 3;
		System.out.println(a);
		
		//Valores padrões para os tipos
		//byte, short, int, long -> 0;
		//boolean -> false;
		//char -> '\u0000';
	}
	
	//Usa-se o 'this' para referenciar o objeto atual para referenciar a INSTÂNCIA e não a CLASSE
	//Também se usa quando há parâmetros iguais (parâmetros e atributos da classe)
	//Os parâmetros passados em uma função são visíveis apenas no método construtor
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada(){
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		//System.out.printf("%d/%d/%d\n", dia, mes, ano);
		System.out.println(this.obterDataFormatada());
	}
	
	//Esse tipo de situação não pode ocorrer, porque o static pertence a CLASSE e não a INSTÂNCIA
	/*static void teste() {
		this.dia = 3;
	}*/
}