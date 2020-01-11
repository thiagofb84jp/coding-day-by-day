package fundamentos;

public class TipoString {

	/**
	 * Pontos Importantes:
	 * 1. String é um objeto imutável (jamais será modificado o valor inicial atribuído a ela);
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Olá pessoal!".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa")); //true
		System.out.println(s.toLowerCase().startsWith("boa")); //true
		System.out.println(s.endsWith("tarde")); //true
		System.out.println(s.toUpperCase().endsWith("TARDE")); //true
		System.out.println(s.length()); //9
		System.out.println(s.equals("boa tarde")); //false
		System.out.println(s.equalsIgnoreCase("boa tarde")); //true
		
		String nome = "Pedro";
		String sobrenome = "Santos";
		int idade = 33;
		float salario = 12345.987F;
		
		System.out.println("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade +
							"\nSalario: " + salario + "\n\n");
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade +
									"\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, 
							salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, 
										salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 8));		
	}
}