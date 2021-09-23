package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeAluno(a1);
		} 
		catch(Exception excecao) {
			System.out.println("Ocorrou errrooooo");
		}
		
		try {
			System.out.println(7/0);
		}
		catch(ArithmeticException e) {
			//System.out.println("Olha q oq jãoo: "+e.getMessage());
		}
		
		
		
		
		System.out.println("Fim");
		
	}

	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
