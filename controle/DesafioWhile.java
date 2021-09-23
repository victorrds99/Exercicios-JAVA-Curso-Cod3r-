package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		int quantidadeNota = 0;
		double total = 0;
		
		while (nota != -1) {
			
			System.out.println("Digite uma nota: ");
			nota = entrada.nextDouble();
			
			if (nota <=10 && nota >= 0) {
			total += nota;
			quantidadeNota++;
			}else {
				System.out.println("nota invalida!!");
			}
			
		}
		
		entrada.close();
		double media = total / (quantidadeNota);
	
		
		System.out.print("Sua média é: "+ media + " e vc jogou "+ (quantidadeNota) + " para o sistema calcular a média..");
	}

}
