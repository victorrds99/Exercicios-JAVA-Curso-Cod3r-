package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();	
		
		Usuario u1 = new Usuario("ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		
		lista.add(new Usuario("Victor"));
		
		lista.add(new Usuario("Lia"));
		
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3).nome);
		
		lista.remove(0);
		
		
		System.out.println();
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		
		
	}

}
