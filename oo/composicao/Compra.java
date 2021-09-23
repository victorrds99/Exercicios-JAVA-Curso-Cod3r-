package oo.composicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
		
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	
	
	String getTotal() {
		double total = 0;
		String nome = null;
		double valor = 0;
		int quantidade = 0;
		
		for(Item item: itens) {
			total+= item.quantidade * item.preco;
			nome = item.nome;
			valor = item.preco;
			quantidade = item.quantidade;
		}
		
		return  "nome : " + nome + " | valor: " + valor + " | " + " Quantidade: " + quantidade +"\ntotal: " + total ;
	}

}
