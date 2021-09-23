package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		
		
		
		
		try {
			Aluno aluno = new Aluno(" f", -1);
			//Validar.aluno(null);
			Validar.aluno(aluno);
		} catch (StringVaziaException e) {
			System.out.println(e.getLocalizedMessage());
		}catch (NumeroNegativoException | IllegalArgumentException e) {
			System.out.println(e.getLocalizedMessage());
		}

		System.out.print("fin");
		
	}

}
