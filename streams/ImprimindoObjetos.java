package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana", "victor");
	
//		for (int i = 0; i < aprovados.size() ; i++) {
//			System.out.println(aprovados.get(i));
//		}
		System.out.println("Usando Foreach...");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando iterator...");
		Iterator<String> it = aprovados.iterator();	
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		System.out.println("\nUsando Streams...");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println); //la�o interno 
		
		
		
	}
	
	

}
