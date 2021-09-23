package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		livros.push("o Hobbit");
		
		//mostram o primeiro elemnto.
		//System.out.println(livros.peek());
		//System.out.println(livros.element());
		
		
		//pool mostra e remove
		//System.out.println(livros.poll());
		
		//System.out.println(livros.element());
		
		System.out.println(livros.contains("Don Quixote"));
	}

}
