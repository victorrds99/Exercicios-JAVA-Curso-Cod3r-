package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";
		compra1.adicionarItem("Caneta", 20, 7.45);
		
		System.out.println(compra1.getTotal());
		
		compra1.adicionarItem(new Item("Borracha", 12, 3.89));
		
		System.out.println(compra1.getTotal());
		
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		
		System.out.println( compra1.getTotal());
		
		compra1.adicionarItem("Sacola", 2, 5.0);
		
		System.out.println(compra1.getTotal());
		
	
	}
}
