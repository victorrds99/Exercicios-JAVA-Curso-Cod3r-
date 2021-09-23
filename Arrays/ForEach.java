package Arrays;

import java.util.Arrays;

public class ForEach {
	public static void main(String[] args) {
		
		double[] notas = {4.4, 5.5, 6.6, 7.7, 8.8};
		
		double[] i = {0.0, 0.0, 0.0, 0.0, 0.0};
		
		
		//forEach para varrer a Array notas, utilizando a variavel local nota.
		for(double nota: notas) {
			System.out.println(nota);
			
			//salvando os itens da array na variavel i
			i = notas;
			
			
			
			
		}
		//mostrando arrays.
		System.out.println(Arrays.toString(i));
		
	//usando a variavel i, para pegar pegar os dados varridos do forEach à cima.
		for(int c =0; c < notas.length; c++) {
			System.out.println(i[c]);
		}
		
		
	}

}
