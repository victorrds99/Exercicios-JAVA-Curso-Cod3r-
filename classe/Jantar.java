package classe;

import java.util.Scanner;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz Branquinho", 0.3);
		Comida c2 = new Comida("Feijão Preto", 0.4);
		
		Scanner sc = new Scanner(System.in);

		

		sc.close();
		
		
		Pessoa p = new Pessoa();
		p.nome = "Heloisa";
		p.peso = 50.0;
		
		System.out.println(p.peso);
		
		
		//double ComendoArroz = p.comer(c1.peso);
		//double ComendoFeijao = p.comer(c2.peso);
		
		System.out.println(p.nome);
		p.comer(c2);
		System.out.println(p.peso);
		p.comer(c1);
		System.out.println(p.peso);
		p.comer(c1);
		System.out.println(p.peso);
		
	}

}
