package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("informe um numero");
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0) {
			System.out.println("Esse numero é par! \t" + numero); 
		}
		else {
			System.out.println("Esse numero é impar! \t" + numero);
		}
	}

}
