package colecoes;

import java.util.HashSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//HashSet<String> listaAprovados = new HashSet<>();
		
		TreeSet<String> listaAprovados = new TreeSet<>();
		
		listaAprovados.add("Victor");
		listaAprovados.add("Heloisa");
		listaAprovados.add("Viviane");
		listaAprovados.add("Jailza");
		
		for(String canditado: listaAprovados) {
			System.out.println(canditado);
			
		}
		HashSet<Integer> nums = new HashSet<>();
		
		
		
		nums.add(1);
		nums.add(12);
		nums.add(120);
		nums.add(51);
		
		
		for(int numero: nums) {
			System.out.println(numero);
			
		}
		
	}

}
