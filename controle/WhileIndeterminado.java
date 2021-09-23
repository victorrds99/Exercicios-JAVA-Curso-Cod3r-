package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String Usuario = "";
		while(!Usuario.equalsIgnoreCase("sair")) {
			System.out.print("Digite algo: ");
			Usuario = entrada.next();
			
		}
		entrada.close();
	}

}
