package lambdas;


@FunctionalInterface
public interface Calculo {
	
	
	//metodo acessado atraves da instancia
	double executar(double a, double b);
	
	
	//metodo padrao, atravez da instancia
	default String legal() {
		return "legal";
	}
	
	
	//Diretamente a interface
	static String muitoLegal() {
		return "muito legal";
	}

}
