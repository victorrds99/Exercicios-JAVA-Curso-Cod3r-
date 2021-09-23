package controle;

import java.util.Scanner;

public class SwitchSemBreak {
	public static void main(String[] args) {
		System.out.println("Olá!!! Você luta Karatê. Digite sua faixa atual: ");
		Scanner entrada = new Scanner(System.in);
		
		String usuario = entrada.next();
		
		entrada.close();
		switch(usuario.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
		case "roxa":
			System.out.println("sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sandan..");
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
			break;
			default:
				System.out.println("Estou começando aprender...");
			
		}
	}

}
