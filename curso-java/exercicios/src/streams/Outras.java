package streams;

import java.util.Arrays;
import java.util.List;

public class Outras {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Patrícia", 10);
		Aluno a6 = new Aluno("Joseana", 10);
		Aluno a7 = new Aluno("Carlos", 10);
		Aluno a8 = new Aluno("Jonathan", 10);
		Aluno a9 = new Aluno("Jonathan", 10);
		Aluno a10 = new Aluno("Jonathan", 10);
		Aluno a11 = new Aluno("Jonathan", 10);
		Aluno a12 = new Aluno("Patrick", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit...");
		alunos.stream()
		.distinct()
		.skip(2)
		.limit(2)
		.forEach(System.out::println);		
	}
}