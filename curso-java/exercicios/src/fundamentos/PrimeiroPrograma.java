package fundamentos;

/**
 * Esta classe representa o primeiro programa a ser executado...
 * Trata-se sobre a importância dos comentários
 * Lembre-se: comente APENAS aquilo que é necessário!
 * @author Thiago Ferreira <thiago.barbosa@email.com>
 * @since JDK1.0
 * 
 */
public class PrimeiroPrograma {
	/*
	 * 'Main' é a porta de entrada para executar o programa em Java
	 *  Estrutura responsável por iniciar um programa em Java
	 */
	
	/**
	 * ...
	 * Javadoc comment
	 * @param args
	 */
	
	public static void main(String[] args) {
		//Uma senteça de código termina com ponto-e-vírgula;
		//Mais um comentário...
		//Fim :)
		System.out.println("My first program!");
		System.out.println("Hello World!");
		System.out.println("I'm coding in Java! I love to code.");
		System.out.println("Java Rocks!");
		
		/*
		 * This is about comment lines
		 * Line 1
		 * Line 2
		 */
		
		{
			System.out.println("Another block code here!");
		}
		
		{
			{
				{
					System.out.println("Another block code here!");
					System.out.println("Fim!"); //Aqui também funciona!
				}
			}
		}
	}
}