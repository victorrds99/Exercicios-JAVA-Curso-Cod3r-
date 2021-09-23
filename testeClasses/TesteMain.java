package testeClasses;


public class TesteMain {
	
	public static void main(String[] args) {
		
		Condominio casa = new Condominio();
		
		
	 		casa.cozinha = "Geladeira \nFogão \nPia \nArmário \nMicroondas";
	 		casa.sala = "\nSofa \nPainel TV";
	 		casa.quarto = "\nCama \nGuarda-Roupas \nSuporte TV";
	 		casa.banheiro = "\nPrivada \nGabinete com pia e espelho \nBox \nChuveiro";
	 		
	 		System.out.println(casa.cozinha + casa.sala + casa.quarto + casa.banheiro);
		 
	}
}
