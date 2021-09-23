package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3035.89, 0.13);
	
		String nome = p.nome;
		Double valor = p.preco;
		Double desconto = p.desconto;
		
		System.out.println(nome + " " + valor + " " + desconto);
		

		BinaryOperator<Double> PrecoComDesconto = (n1, n2) -> n1 * (1 - n2);
		System.out.println(	PrecoComDesconto.apply(valor, desconto));
		
		UnaryOperator<Double> impostoMunicipal = v -> v >= 2500 ? v*(1.0 + 0.08) : v;
		
		Double impostoMunicipal1 = impostoMunicipal.apply(PrecoComDesconto.apply(valor, desconto));
		System.out.printf("Preço com imposto: R$%.2f \n",impostoMunicipal1);
		
		UnaryOperator<Double> frete = v -> v >= 3000 ? v+100 : v+50;
		
		double comFrete = frete.apply(impostoMunicipal1 );
		
		System.out.printf("Com frete fica assim R$%.2f",comFrete);
		
		

		
	//	Function<Double, String> conceito =       m -> m >= 7 ? "Aprovado": "Reprovado";
		
				
	}

}
