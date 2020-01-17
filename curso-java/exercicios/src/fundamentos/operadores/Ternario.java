package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		double media = 7.6;
		String resultadoFinal = media >= 7.0 ? 
				"aprovado." : "em recuperação."; //Aqui tem-se uma atribuição condicional
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("\nTem desconto? " + resultado);
	}
}