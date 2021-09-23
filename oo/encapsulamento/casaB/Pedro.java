package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	
	//Ana mae = new Ana();
	void testeAcessos() {
		
		//segredo é privado, só ana consegue acessar.
				//System.out.println(segredo);
				//System.out.println(facoDentroDeCasa);
				System.out.println(formaDeFalar);
				System.out.println(TodosSabem);
				System.out.println(new Ana().TodosSabem);
			}
		
	}
