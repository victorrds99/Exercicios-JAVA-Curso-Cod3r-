package fundamentos.operadores;

import java.util.Scanner;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bom dia, Você fez o trabalho1 =true ou =false?");
		
		
		
		boolean trabalho1 = Boolean.parseBoolean(entrada.nextLine());
		
		System.out.println("Bom dia, Você fez o trabalho2 =true ou =false?");
		
		boolean trabalho2 = Boolean.parseBoolean(entrada.nextLine());
		
		if(trabalho1 == true && trabalho2 == true) {
			System.out.println("Uaal, Parabéns Você completou os trabalhos, vai comprar a TV de 50 polegadas!");
			System.out.println("\nComprou sorvete, está MENOS saudavel.");
		}
		
		else if (trabalho1 == true ) {
			System.out.println("Parabéns, você completou o TRABALHO 1. \nGarantiu uma TV de 32 Polegadas!!!");
			System.out.println("\nComprou sorvete, está MENOS saudavel.");
		}
		else if (trabalho2 == true) {
			System.out.println("Parábéns, Você completou o TRABALHO 2. \nGarantiu uma TV de 32 Polegadas!!!");
			System.out.println("\nComprou sorvete, está MENOS saudavel.");
		}
		else {
			System.out.println("Poxa que triste, você não completou os trabalhos, por isso não comprou a TV \nNão comprou sorvete, mas olha para o lado bom, você está MAIS saudavel.");
		}
		
		
	}
}
