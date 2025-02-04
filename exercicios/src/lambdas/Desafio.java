package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

//	189 Desafio Lambdas
	public static void main(String[] args) {

		// 1 - A partir do produto calcular o preço real (com desconto)
		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);

		// 2 - Calcular Imposto Municipal: >= 2500(8,5%) / < 2500 - Isento
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;

		// 3 - Calcular Frete: >= 3000 (100) / < 3000 (50)
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

		// 4 - Arrendondar - Deixar com duas casas decimais
		UnaryOperator<Double> arredondar = preco -> {
			BigDecimal bd = new BigDecimal(preco).setScale(2, RoundingMode.HALF_UP);
			return bd.doubleValue();
		}; // utilizando a classe BigDecimal

		// UnaryOperator<Double> arredondar = preco ->
		// Double.parseDouble(String.format("%.2f", preco)); //Arrendondamento da
		// resposta

		// 5 - Formatar R$ 1234,56
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

		Produto p = new Produto("Ipad", 3235.89, 0.13); // intancia do produto.

		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar)
				.apply(p);

		System.out.println(preco);

	}
}
