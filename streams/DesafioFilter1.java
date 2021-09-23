 package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {
	
	public static void main(String[] args) {
		
		
		Contas c1 = new Contas("Prestação Apto", 730);
		Contas c2 = new Contas("Consorcio", 220);
		Contas c3 = new Contas("Condominio", 300);
		Contas c4 = new Contas ("Luz", 100);
		
		
		List<Contas> contasFixas = Arrays.asList(c4);
		
		Function<Contas, Integer> outubro = c -> c1.valor + c2.valor + c3.valor + c4.valor;
		
		//Function<Contas, String> saudacao = s -> "Olá Victor!!!\nNeste mês suas contas estão em R$"+outubro;
		
		contasFixas.stream().map(outubro).forEach(System.out::println);
	}

}
