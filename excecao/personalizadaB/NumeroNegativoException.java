package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroNegativoException extends Exception {
	
	private String nomeDoAtributo;
	public NumeroNegativoException(String nomeDoAtributo) {
		// TODO Auto-generated constructor stub
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O Atributo '%s' está negativo", nomeDoAtributo);
	}
}