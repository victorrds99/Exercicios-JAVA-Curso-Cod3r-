package Arrays;


import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você gostaria de inserir quantas notas?");
		int v = sc.nextInt();
		double media = 0.0;
		
		double[] notas = new double[v];
		
		
		for(int i = 0; i < v; i++) {
			System.out.printf("Digite a nota %d: ", i+1);
			notas[i] = sc.nextDouble();
		}
		
		

		sc.close();
		
		for(double nota: notas) {
			
			media += nota;
		}
		System.out.println("media: "+media / notas.length);
	}

}
