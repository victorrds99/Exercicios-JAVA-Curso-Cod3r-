package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Locale localeBr = new Locale("pt", "BR");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite Salario1: ");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite Salario2: ");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite Salario3: ");
		String valor3 = entrada.nextLine().replace(",",".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3)/3;
		System.out.println("A media dos salarios é: " + media);
		entrada.close();
	
		//solução feia que eu tinha feito
		//System.out.println((Integer.parseInt(salario) + Integer.parseInt(salario2) + Integer.parseInt(salario3))/3);
		
		
		
		
	}
}
