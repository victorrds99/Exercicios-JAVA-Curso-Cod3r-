package fundamentos.operadores;

public class DesafioOperadoresAritmericos {
	public static void main(String[] args) {
		
	
	int a = 6*(3+2);
	a =(int) Math.pow(a, 2);
	a = a / (3*2);
	
	int b = ((1-5) * (2 - 7))/2;
	b =(int) Math.pow(b, 2);
	
	int c = (a - b);
	
	
	
	
	int d =(int) Math.pow(10, 3);
	
	c =(int) Math.pow(c, 3)/d;
	
	System.out.println(c);
	} 
	
}
