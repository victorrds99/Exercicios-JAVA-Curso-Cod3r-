package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

		void testeAcessos() {
			Ana sogra = new Ana();
			
			//segredo, facoDentroDeCasa e FormaDeFalar, n�o tem acesso. s� public TodosSabem
			
			System.out.println(sogra.TodosSabem);
		}
}
