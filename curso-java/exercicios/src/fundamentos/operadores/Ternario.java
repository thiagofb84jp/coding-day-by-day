package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		double media = 7.6;
		String resultadoFinal = media >= 7.0 ? 
				"aprovado." : "em recupera��o."; //Aqui tem-se uma atribui��o condicional
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.println("\nTem desconto? " + resultado);
	}
}