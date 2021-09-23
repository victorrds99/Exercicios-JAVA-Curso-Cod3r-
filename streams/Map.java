package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		List<String> marcas = Arrays.asList("BMW", "Mercedez", "Audi");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		
//		UnaryOperator<String> maiscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//		UnaryOperator<String> grito = n -> n + "!!!";
		
		System.out.println("\nusando composi��o...");
		
		marcas.stream().map(Utilitarios.maiscula).map(primeiraLetra).map(Utilitarios::grito).forEach(print);
	}

}
