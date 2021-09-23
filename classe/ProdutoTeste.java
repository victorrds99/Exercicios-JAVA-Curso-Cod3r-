package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "notebook";
		p1.preco = 1000.00;
		
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 10.00;
		
		Produto.desconto = 0.50;
		
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		
		
		System.out.println(p1.nome + " R$" + p1.preco + " Com desconto fica: " + precoFinal1);
		System.out.println(p2.nome + " R$" + p2.preco + " Com desconto fica: " + precoFinal2);

	}
}
