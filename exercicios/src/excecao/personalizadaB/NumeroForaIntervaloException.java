package excecao.personalizadaB;

//223 - Exceção Personalizada 02

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {

	private String nomeDoAtributo;

	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	public String getMessage() {

		return String.format("O atributo '%s' está fora do intervalo", nomeDoAtributo);
	}
}
