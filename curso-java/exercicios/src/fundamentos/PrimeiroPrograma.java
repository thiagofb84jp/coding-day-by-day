package fundamentos;

/**
 * Esta classe representa o primeiro programa a ser executado...
 * Trata-se sobre a import�ncia dos coment�rios
 * Lembre-se: comente APENAS aquilo que � necess�rio!
 * @author Thiago Ferreira <thiago.barbosa@email.com>
 * @since JDK1.0
 * 
 */
public class PrimeiroPrograma {
	/*
	 * 'Main' � a porta de entrada para executar o programa em Java
	 *  Estrutura respons�vel por iniciar um programa em Java
	 */
	
	/**
	 * ...
	 * Javadoc comment
	 * @param args
	 */
	
	public static void main(String[] args) {
		//Uma sente�a de c�digo termina com ponto-e-v�rgula;
		//Mais um coment�rio...
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
					System.out.println("Fim!"); //Aqui tamb�m funciona!
				}
			}
		}
	}
}