package classe;

public class Pessoa {
	
	String nome;
	double peso;
	
	void comer(Comida comida){
		this.peso += comida.peso;
	}

}
