package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		//instanciando para utilizar o metodo executar na interface calculo
		Calculo soma = (x, y) ->{ return x + y;  };
		
		Calculo mult = (x, y) ->{ return x *  y;  };
		
		System.out.println(mult.executar(3, 2));
		
		//aessando metodo default atraves da instancia/objeto
		System.out.println(soma.legal());
		
		//acessando diretamente, Calculo é a interface e muitolegal() é o metodo
		System.out.println(Calculo.muitoLegal());
		
		
	}

}
