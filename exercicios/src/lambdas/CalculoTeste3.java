package lambdas;

import java.util.function.BinaryOperator; // usando interface funcional do java

// 178 - Usando Interface funcionais 
public class CalculoTeste3 {
// 175 - Primeira função lambda
	public static void main(String[] args) {

		BinaryOperator<Double> calc = (x, y) -> { // usando o BinaryOperator, uma interface funcional do java, aonde temos que indicar o tipo no <>
			return x + y;
		}; // definido a logida usando lambda
		System.out.println(calc.apply(2.0, 3.0));

		calc = (x, y) -> x * y; // quando nao colocamos as chaves o java identifica -> que ja é o retorno
								// desejado, não posso utilizar mais de uma sentença de codigo
		System.out.println(calc.apply(2.0, 3.0));
	}
}
