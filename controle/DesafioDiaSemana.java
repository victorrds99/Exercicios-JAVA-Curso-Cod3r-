package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("dia 1");
		}
		else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("dia 2");
		}
		else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("dia 3");
		}
		else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("dia 4");
		}
		else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("dia 5");
		}
		else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("dia 6");
		}
		else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("dia 7");
		}
		else {
			System.out.println("Dia invalido!!!");
		}
			entrada.close();
	}

}
