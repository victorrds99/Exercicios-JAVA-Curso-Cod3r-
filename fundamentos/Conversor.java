package fundamentos;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		Integer idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		//System.out.println("Qual o seu sobrenome?");
		//String sobrenome = teclado.nextLine();
		teclado.close();
		if (idade < 18) {
			System.out.printf("Olá %s, Seja bem vindo!", nome);
		}
		else {
			
			System.out.printf("Oi %s, com %s anos, você já está velha kkk", nome, idade);
		}
		  
		
	}
}
