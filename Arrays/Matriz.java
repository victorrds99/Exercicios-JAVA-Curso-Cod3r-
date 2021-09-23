package Arrays;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos Alunos? ");
		int qtAlunos = sc.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtNotas = sc.nextInt();
		
		double[][] notasTurma = new double [qtAlunos][qtNotas];
		
		double total = 0;
		for(int a=0; a<notasTurma.length; a++) {
			for (int n=0; n<notasTurma[a].length; n++) {
				
				System.out.printf("Informe a %da nota do aluno %d: ", n+1, a+1);
				notasTurma[a][n] = sc.nextDouble();
				total += notasTurma[a][n];
			}
		}
		double media = total / (qtAlunos * qtNotas);
		System.out.println("Média da turma é: "+ media);
		sc.close();
	}

}
