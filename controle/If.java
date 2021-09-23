package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe a média: ");
		double media = entrada.nextDouble();
		
		boolean criterioAprov = media <= 10 && media >= 7 ;
		boolean criterioRecup = media >=5.5 && media < 7;
		
		if(criterioAprov) {
			System.out.println("Passsoooou");
		}else if (criterioRecup) {
			System.out.println("Recuperação chapa!");
		}
		else {
			System.out.println("Reprovou");
		}
		
		entrada.close();
	}
}
