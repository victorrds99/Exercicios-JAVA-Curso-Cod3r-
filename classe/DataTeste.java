package classe;

//import java.util.Scanner;

public class DataTeste {
	
	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		
		Data nascimento = new Data();
		
		Data admissao = new Data();
		
		Data inicio = new Data(01,02,1989);
		
		Data helo = new Data();
		//System.out.println("Digite o dia de nascimento: ");
		//nascimento.dia = entrada.nextInt();
		
		//System.out.println("Digite o mês de nascimento: ");
		//nascimento.mes = entrada.nextInt();
		
		//System.out.println("Digite o ano de nascimento: ");
		//nascimento.ano = entrada.nextInt();
		
		//entrada.close();
		
		//System.out.println("Sua data de nascimento é: " + nascimento.obterDataFormatada());
	
		nascimento.dia = 06;
		nascimento.mes = 07;
		nascimento.ano = 1999;
		
		admissao.dia = 02;
		admissao.mes = 07;
		admissao.ano = 2021;
		
		//String dataFormatada1 = nascimento.obterDataFormatada();
		
		//System.out.print("a data de admissão é: " + admissao.obterDataFormatada());
		
		nascimento.imprimirDataFormatada();
		admissao.imprimirDataFormatada();
		
		inicio.imprimirDataFormatada();
		helo.imprimirDataFormatada();
		
	}

}
