package lambdas;

public class CalculoTeste2 {
// 175 - Primeira função lambda
	public static void main(String[] args) {

		Calculo calc = (x, y) -> {
			return x + y;
		}; // definido a logida usando lambda
		System.out.println(calc.executar(2, 3));

		calc = (x, y) -> x * y; // quando nao colocamos as chaves o java identifica -> que ja é o retorno
								// desejado, não posso utilizar mais de uma sentença de codigo
		System.out.println(calc.executar(2, 3));
	}
}
