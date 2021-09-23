package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	double num1 = entrada.nextDouble();
	
	System.out.println("Digite um operador: ");
	String operador = entrada.next();
	
	System.out.println("Digite outro numero: ");
	double num2 = entrada.nextDouble();
	
	double resposta = "+".equals(operador) ? num1 + num2 : 0;
	resposta = "-".equals(operador) ? num1 - num2 : resposta;
	resposta = "*".equals(operador) ? num1 * num2 : resposta;
	resposta = "/".equals(operador)	? num1 / num2 : resposta;
	resposta = "%".equals(operador)	? num1 % num2 : resposta;
	
	System.out.print(num1);
	System.out.print(operador);
	System.out.print(num2);
	System.out.print(" = "+ resposta);
	
	
	entrada.close();
	
	}
}