package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("John", "Mary", "Edward", "James", "Stewie", "Barbara");

		System.out.println("Forma tradicional... <usando Foreach>");

		for (String nomes : aprovados) {
			System.out.println(nomes);
		}

		System.out.println("\nUsando Lambda Function #01.... <também usando foreach>");

		aprovados.forEach((nome) -> {
			System.out.println(nome);
		});
		
		System.out.println("\nMethod Reference #01..."); //Passando uma referência para um método :)
		aprovados.forEach(System.out::println);
		
		System.out.println("\nUsando Lambda Function #02.... <também usando foreach>");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}