package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8, false);
		Aluno a2 = new Aluno("Bia", 5.8, true);
		Aluno a3 = new Aluno("Gabriel", 9.8, true);
		Aluno a4 = new Aluno("Daniel", 6.8, true);
		Aluno a5 = new Aluno("Guilherme", 7.1, false);
		Aluno a6 = new Aluno("Rebecca", 8.8, true);
		Aluno a7 = new Aluno("Marcos", 7.8, true);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
		Predicate<Aluno> bomComportamento = aluno -> aluno.bomComportamento;
		Function<Aluno, String> saudacaoAprovado = 
				aluno -> "Parabéns " + aluno.nome + "! Você foi aprovado(a) \ne teve um bom comportamento no ano letivo.\n";
				
		alunos.stream()
			.filter(aprovado)
			.filter(bomComportamento)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
	}
}