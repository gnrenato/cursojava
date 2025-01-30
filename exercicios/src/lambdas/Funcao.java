package lambdas;

import java.util.function.Function;

// 184 Function
public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar"; // definindo a função
		System.out.println(parOuImpar.apply(32));

		Function<String, String> oResultadoE = valor -> "o Resultado é: " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";

		Function<String, String> duvida = valor -> valor + "???";

		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32); // encadeando as funções
		System.out.println(resultadoFinal1);

		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(33); // encadeando as funções
		System.out.println(resultadoFinal2);

	}
}
