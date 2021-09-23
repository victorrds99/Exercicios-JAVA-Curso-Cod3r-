package streams;

import java.util.Arrays;
import java.util.List;

import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Elza", 3.1);
		Aluno a3 = new Aluno("Heloisa", 8.1);
		Aluno a4 = new Aluno("Victor", 10);
	
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println("todos são aprovados? "+alunos.stream().allMatch(aprovado));
		System.out.println("Alguem foi aprovado? "+alunos.stream().anyMatch(aprovado));
		System.out.print("Ninguém foi aprovado? "+ alunos.stream().noneMatch(reprovado));

	}

}
