package fundamentos.operadores;

public class Aritmeticos {
	// 34 - Operadores Aritmeticos
	public static void main(String[] args) {
		
		System.out.println(2 + 3); // Soma de valores literais
		
		var x = 34.56; // criando a variavel usando inferencia, de acordo com o valor é um double
		double y = 2.2; // criando variavel com do tipo double
		
		System.out.println(x + y); // Soma de valores das variaveis
		System.out.println(x - y); // Subtração de valores das variaveis
		System.out.println(x * y); // Multiplicação de valores das variaveis
		System.out.println(x / y); // Divisão de valores das variaveis
		
		// Operações utilizando int
		int  a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); // realizando uma conversão para double usando Cast
		
		System.out.println(8 % 3); // Usando o operado modulo para resultar no resto da divisão
		System.out.println(a % b);
		
	}
}
