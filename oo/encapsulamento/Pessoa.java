package oo.encapsulamento;

public class Pessoa {

	private int idade = 10;
	
	
	
	public Pessoa(int idade) {
		alterarIdade(idade);
	}
	
	public Pessoa() { };

	public void alterarIdade(int novaIdade) {
		if (novaIdade >= idade && novaIdade <= 120) {
		this.idade = novaIdade;
		}
	}
	
	public int lerIdade() {
		return idade;
	}
}
