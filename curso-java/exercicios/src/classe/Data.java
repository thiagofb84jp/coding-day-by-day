package classe;

public class Data {
	
	/**
	 * 1) Usa-se o 'this' para:
	 * -> Como m�todo;
	 * -> Para referenciar o objeto atual;
	 * -> Par�metros com os mesmos nomes dos atributos de inst�ncia;
	 * -> Para acessar um m�todo que pertence a uma inst�ncia;
	 * -> Para acessar os atributos.
	 * 2) Uma vari�vel local n�o � inicializada por padr�o. Vari�veis definidas diretamente no corpo da classe,
	 * fora dos m�todos, ser�o inicializadas por padr�o;	
	 */
	
	int dia;
	int mes;
	int ano;
	
	//O que vai definir qual construtor ser� chamado � a quantidade e a ordem dos par�metros
	//Sempre que se usa o 'this' como m�todo, significa dizer que est� chamando o construtor
	//N�o se usa o 'this' com um m�todo que n�o � um construtor
	Data(){
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970);
		
		//Objetos -> null;
		String s = null;
		System.out.println(s);
		
		//As vari�veis locais precisam ser inicializadas
		int a = 3;
		System.out.println(a);
		
		//Valores padr�es para os tipos
		//byte, short, int, long -> 0;
		//boolean -> false;
		//char -> '\u0000';
	}
	
	//Usa-se o 'this' para referenciar o objeto atual para referenciar a INST�NCIA e n�o a CLASSE
	//Tamb�m se usa quando h� par�metros iguais (par�metros e atributos da classe)
	//Os par�metros passados em uma fun��o s�o vis�veis apenas no m�todo construtor
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
	
	//Esse tipo de situa��o n�o pode ocorrer, porque o static pertence a CLASSE e n�o a INST�NCIA
	/*static void teste() {
		this.dia = 3;
	}*/
}