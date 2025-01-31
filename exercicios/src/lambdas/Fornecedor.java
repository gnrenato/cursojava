package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// 186 Supplier
public class Fornecedor {

	public static void main(String[] args) {

		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui"); // Não recebe parametro,
																							// retorna algo, nesse caso
																							// uma lista

		System.out.println(umaLista.get());
	}
}
