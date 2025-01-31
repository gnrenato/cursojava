package lambdas;

import java.util.function.Predicate;

// 185 Predicate 2 Composição
public class PredicadoComposicao {

	public static void main(String[] args) {

		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

		System.out.println(isPar.and(isTresDigitos).negate().test(2223));// utilizando o predicate com composição,
																			// encadeando as funções
		System.out.println(isPar.or(isTresDigitos).test(123));
	}
}
