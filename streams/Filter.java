package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Victor", 10);
		Aluno a2 = new Aluno("Vitoria", 9.5);
		Aluno a3 = new Aluno("Vinicius", 9);
		Aluno a4 = new Aluno("Valentin", 6.0);
		Aluno a5 = new Aluno("VanDerVan", 7);
		Aluno a6 = new Aluno("Valentão", 11);	
		Aluno a7 = new Aluno("Gordola", -0.2);	
		

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7 && a.nota <= 10;	
		
		Predicate<Aluno> reprovados = a -> a.nota > 0 && a.nota < 7;
		
		Predicate<Aluno> notaInvalida = a -> a.nota < 0 || a.nota > 10;
		
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns!! "+a.nome+"! Você foi aprovado!!!";
		
		Function<Aluno, String> saudacaoReprovado = a -> "Puts "+a.nome+"! Você não obteve a nota suficiente e foi reprovado!!!";
		
		Function<Aluno, String> saudacaoNotaInvalida =  a -> "Nota invalida "+a.nome+"! Você Colou na prova!!!";
		
		alunos.stream().filter(aprovados)
		.map(saudacaoAprovado)
		.forEach(System.out::println);
		
		alunos.stream().filter(notaInvalida)
		.map(saudacaoNotaInvalida)
		.forEach(System.out::println);
			
		alunos.stream().filter(reprovados)
		.map(saudacaoReprovado)
		.forEach(System.out::println);
		
	}
}
