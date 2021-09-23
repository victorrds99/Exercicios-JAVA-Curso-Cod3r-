package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		System.out.println("� par? "+isPar.test(133));
		System.out.println("tem 3 digitos? "+isTresDigitos.test(33));
		
		System.out.println("� par E tem 3 digitos?" + isPar.and(isTresDigitos).test(131));
		System.out.println("� par OU tem 3 digitos" + isPar.or(isTresDigitos).test(133));
		
	}

}
