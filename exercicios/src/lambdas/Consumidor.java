package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// 183 Consumer
public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);

		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1); // usei o accept pois chamei somente um produto

		Produto p2 = new Produto("Notebook", 2987.99, 0.09);
		Produto p3 = new Produto("Caderno", 19.90, 0.09);
		Produto p4 = new Produto("Borracha", 7.80, 0.09);
		Produto p5 = new Produto("Lapis", 4.39, 0.09);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome); // não precisou usar o accept pois o forEach já é um consumer
		produtos.forEach(p -> System.out.println(p.preco)); // fazendo o lambda diretamento no forEach
		produtos.forEach(System.out::println); // passando por referencia

	}
}
