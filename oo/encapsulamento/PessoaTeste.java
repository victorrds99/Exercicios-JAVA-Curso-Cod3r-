package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(11);
		
		p1.alterarIdade(120);
		
		System.out.println(p1.lerIdade());
	}

}
