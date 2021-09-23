package controle;

import java.util.Scanner;

;

public class DoWhile {
	
	public static void main(String[] args) {
		
		//if (expressão) sentença; ou {}
		//while (..) {}
		//for (..; ..;..) {}
		Scanner entrada = new Scanner(System.in);

		String texto = "por favor";
		do {
			System.out.println("Digite as palavras magicas...");
			texto = entrada.nextLine();
			
		}
		while (!texto.equalsIgnoreCase("por favor")); 
		entrada.close();
		System.out.println("Obrigado! Tchau!");
	}

}
