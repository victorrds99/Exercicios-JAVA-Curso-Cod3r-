package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

		void testeAcessos() {
			Ana sogra = new Ana();
			
			//segredo, facoDentroDeCasa e FormaDeFalar, não tem acesso. só public TodosSabem
			
			System.out.println(sogra.TodosSabem);
		}
}
