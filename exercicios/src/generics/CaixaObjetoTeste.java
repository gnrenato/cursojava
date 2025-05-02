package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {

		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); // double -> Double

		// essa é uma conversão de forma explicita para que nao caia em uma exceção.
		// Somos obrigados a fazer um cast para que nao apresente a exceção
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
	}
}
