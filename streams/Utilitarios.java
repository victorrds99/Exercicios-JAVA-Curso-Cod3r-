package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	static UnaryOperator<String> maiscula = n -> n.toUpperCase();
	
	static String grito(String n) {
			return n + "!!!";
	}

}
