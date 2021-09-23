package classe;

public class Usuario {
	
	String nome;
	String email;
	
	/*
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			return super.equals(obj);
		}
		else {
			return false;
		}
		
	}
	*/
	
	
	public boolean equals(Object objeto) {
		
		Usuario outro = (Usuario) objeto;
		
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email);
		

		
		
		return nomeIgual && emailIgual;
	}

}
