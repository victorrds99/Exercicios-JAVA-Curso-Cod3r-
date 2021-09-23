package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		try {
			geraErro2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("fim");
	}
	//Exce��o n�o checada ou verificada.
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #01");
		
	}

	//Exce��o checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #02");
	}
}
