package Arrays;


public class TesteArray {
	
	public static void main(String[] args) {
		
		String[] selecaoBrasileira = new String[11];
		
		selecaoBrasileira[0] = "Rogério Ceni";
		selecaoBrasileira[1] = "Thiago Silva";
		selecaoBrasileira[2] = "Davi Luis";
		selecaoBrasileira[3] = "Marcelo";
		selecaoBrasileira[4] = "Daniel Alves";
		selecaoBrasileira[5] = "Hernanes";
		selecaoBrasileira[6] = "Vitinho";
		selecaoBrasileira[7] = "Ganso";
		selecaoBrasileira[8] = "GabiGol";
		selecaoBrasileira[9] = "Luis Fabiano";
		selecaoBrasileira[10] = "Neymar JR.";
		
		System.out.print("Seleção Brasileira\n");
		for (int i = 0; i < selecaoBrasileira.length; i++) {
			
			System.out.println(i+"- "+selecaoBrasileira[i]);
		}
		
		
		
	}

}
