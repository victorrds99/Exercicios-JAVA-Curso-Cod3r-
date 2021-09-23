package oo.encapsulamento.casaA;

public class Ana {
	
	private String segredo = "deu o boga";
	String facoDentroDeCasa = "Cocô"; //default ou pacote
	protected String formaDeFalar = "Sutaque";
	public String TodosSabem = "CorDoCabelo";
										
	public static void main(String[] args) {
		
		
		Ana ana = new Ana();
		System.out.println(ana.segredo);
	}
}
