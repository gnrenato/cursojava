package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// 205 Desafio Filter 2
public class DesafioFilter2 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3500.90, 0.30, 0);
		Produto p2 = new Produto("Caderno", 12.90, 0.10, 15.00);
		Produto p3 = new Produto("Caneta", 5.90, 0.00, 5.00);
		Produto p4 = new Produto("Celular", 2999.90, 0.40, 0);
		Produto p5 = new Produto("Monitor", 500.90, 0.20, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Produto> desconto = p -> p.desconto >= 0.30;
		Predicate<Produto> freteGratis = f -> f.frete == 0;
		Function<Produto, String> produtoDescFrete = p -> "O produto: " + p.nome + " No valor R$" + p.preco + " Com desconto e frete Gratis";
		
		produtos.stream().filter(desconto).filter(freteGratis).map(produtoDescFrete).forEach(System.out::println);
		
	}
}
