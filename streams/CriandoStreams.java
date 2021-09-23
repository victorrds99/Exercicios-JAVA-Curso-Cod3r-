package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> imprime = System.out::print;
		Consumer<Integer> print = System.out::println;
		
		
		Stream<String> linguagens = Stream.of("Java", " PHP ", "JS\n");
		linguagens.forEach(imprime);
		
		String[] maisLinguagens = {"Python", " Lisp ", " Perl ", "Go\n"};
		
		Stream.of(maisLinguagens).forEach(imprime);
		Arrays.stream(maisLinguagens).forEach(imprime);;
		Arrays.stream(maisLinguagens, 0, 3).forEach(imprime);
		
		List<String> outrasLinguagens = Arrays.asList("C++", " Kotlin ", "Assemble\n");
		outrasLinguagens.stream().forEach(imprime);
	
		outrasLinguagens.parallelStream().forEach(imprime);
		
		// Stream.generate(() -> "a").forEach(imprime);		
		Stream.iterate(0, n -> n + 1).forEach(print);
	}
}
