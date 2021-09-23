package oo.composicao.Desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Gastei no carro");
		
		Compra compra1 = new Compra();	
		compra1.adicionarItem("Velas", 20.0, 4);
		compra1.adicionarItem(new Produto("Motor", 2750.00), 1);
		compra1.adicionarItem("Tuneo", 1000.0, 1);
		compra1.adicionarItem(new Produto("Sistema de Arefecimento", 500.00), 1);
		compra1.adicionarItem(new Produto("Caixa de direção", 1111.00), 1);
		compra1.adicionarItem("Valor do Carro", 2400.00, 1);
		compra1.adicionarItem("Documentos e Placa", 850.00, 1);

//		Compra compra2 = new Compra();	
//		compra2.adicionarItem("Caderno", 10.0, 10);
//		compra2.adicionarItem(new Produto("impressora", 998.90), 1);
//		
cliente.adicionarCompra(compra1);
//		cliente.compras.add(compra2);
		
		System.out.println(cliente.nome + " comprou --> "+ cliente.obterValorTotal());
		System.out.println(compra1.listaTotal());
		
		
		
	}

}
