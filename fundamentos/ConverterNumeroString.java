package fundamentos;

public class ConverterNumeroString {
	public static void main(String[] args) {
		
		//convertendo Integer pra String e usando length pra contar quantos caracter
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		//Acessando a Wapeer Integer, e usando o ToString para converter, e length pra contar
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
	}
	
}
