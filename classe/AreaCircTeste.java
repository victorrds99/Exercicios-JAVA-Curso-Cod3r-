package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
		//a.pi = 10;
		
		//AreaCirc.pi = 3.1415;
		System.out.println(a.area());
		
		//acessando direto pela classe, sem usar o objeto.
		System.out.println(AreaCirc.area(100));
		
	}

}
