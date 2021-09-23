package lambdas;

public class CalculoTeste {
	
	public static void main(String[] args) {
		
		Calculo soma = new Somar();
		Calculo mult = new Multiplicar();
		
		System.out.println(mult.executar(3, 2));
		

		
	}

}
