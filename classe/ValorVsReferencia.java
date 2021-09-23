package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribui��o por valor;
		
		a++;
		b--;
		System.out.println(a +" "+ b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //atribui��o por refer�ncia, endere�o do objeto.
	
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
