package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

// 208 - Reduce 02
public class Reduce1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		BinaryOperator<Integer> soma = (ac, n) -> ac + n; // função para somar os numeros

		int total1 = nums.stream().reduce(soma).get(); // criando o stream utilzando reduce como termial, associando a
														// uma variavel do tipo primitivo
		System.out.println(total1);

		Integer total2 = nums.stream().reduce(100, soma); // passando o valor inicial
		System.out.println(total2);

		// Resultado foi um Opcional<Integer>
		nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println); // utilizano um reduce, utilizando
																						// o ifPresent para mostrar o
																						// valor
	}
}
