package arrays;

public class Foreach {
	
	/**
	 * Pontos Importantes: 
	 * 1. 
	 * @param args
	 */
	
	public static void main(String[] args) {
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		
		System.out.println("/************** Acessando os elementos do Array pelo 'For' comum **************/");
		//For tradicional
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println("/************** Acessando os elementos do Array pelo 'Foreach' :D **************/");
		//This is Foreach :D
		for (double nota : notas) {
			System.out.println(nota);
		}
	}
}
