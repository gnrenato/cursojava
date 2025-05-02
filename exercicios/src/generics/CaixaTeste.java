package generics;

//249 - Exemplo Basico COM Generics
public class CaixaTeste {

	public static void main(String[] args) {

		// Não precisamos realizar o cast para que utilizamos, definindo o tipo quando
		// criamos o objeto
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo");

		String coisaA = caixaA.abrir();
		System.out.println(coisaA);

		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.2);

		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}
