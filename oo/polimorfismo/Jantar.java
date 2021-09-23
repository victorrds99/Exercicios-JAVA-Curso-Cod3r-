package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(69.55);
		
		Arroz ingrediente1 = new Arroz(0.25);	
		Feijao ingrediente2 = new Feijao(0.15);	
		
		Sorvete sobremesa = new Sorvete(0.05);
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
		
	}
}
