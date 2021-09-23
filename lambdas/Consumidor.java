package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 6.34, 0.09);
		imprimir.accept(p1);
		

		Produto p2 = new Produto("Nootebook", 12000.34, 0.09);
		//imprimir.accept(p2);
		

		Produto p3 = new Produto("Caneca", 12.34, 0.09);
		//imprimir.accept(p3);
		

		Produto p4 = new Produto("Monitor", 1256.34, 0.09);
		imprimir.accept(p4);
		
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
	}

}
