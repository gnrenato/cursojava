package lambdas;

import java.util.function.UnaryOperator;

// 187 Unary Operator
public class OperadorUnario {

	public static void main(String[] args) {
//		Criamos as funções unarias
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;

		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0); // encadeamento de funções sequencial usanod andThen
		System.out.println(resultado1);
		
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0); // encadeamento usando compose, começa com o ultimo. 
		System.out.println(resultado2);
	}
}
