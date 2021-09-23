package oo.herenca.desafio;

public class Carro {
	
	protected final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	
	public int getDelta() {
		return delta;
	}



	public void setDelta(int delta) {
		this.delta = delta;
	}



	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}
		velocidadeAtual += getDelta();
		
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	
	}
	
	public String toString() {
		return "A velocidade Atual é "+ velocidadeAtual + "Km/h";
	}
		
}

	