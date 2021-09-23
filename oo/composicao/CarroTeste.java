package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro gol = new Carro();
		
		System.out.println(gol.estaLigado());
		gol.ligar();
		System.out.println(gol.estaLigado());
		
		System.out.println(gol.motor.giros());
		gol.acelerar();
		
		gol.acelerar();
		
		
		System.out.println(gol.motor.giros());
		
		gol.frear();
		gol.frear();
		gol.frear();
		gol.frear();
		gol.frear();
		gol.frear();

		gol.frear();
		
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		System.out.println(gol.motor.giros());
		
		
	}

}
