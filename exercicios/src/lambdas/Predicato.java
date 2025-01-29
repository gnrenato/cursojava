package lambdas;

import java.util.function.Predicate;

// 182 - Predicate 1
public class Predicato {

	public static void main(String[] args) {

		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750; // Recebe um parametro e retorna true/false (o produto é caro?)

		Produto produto = new Produto("Notebook", 3893.89, 0.85);
		System.out.println(isCaro.test(produto));

	}
}
