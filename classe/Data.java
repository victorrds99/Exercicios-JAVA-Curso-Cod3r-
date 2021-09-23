package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1, 1, 1970);
		
		
	}
	
	Data(int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
