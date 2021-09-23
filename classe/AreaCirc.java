package classe;

public class AreaCirc {
	
	double raio;
	final static double pi = 3.14;
	
	//constructor
	AreaCirc(double raioInicial){
		
		raio = raioInicial;
	}
	
	double area() {
		return raio * raio * pi;
	}
	
	//static � um metodo que pertence a clase, n�o ao objeto ou instancia.
	static double area(double raio) {
		return pi * Math.pow(raio, 2);
	}
}
