package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// 22 Desafio Variaveis e Contantes
		// Formula (°F - 32) x 5/9 = °C
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		double fahrenheit = 96.8;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.printf("O resultado é: %fC°", celsius);
		
		fahrenheit = 100;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.printf("\nO resultado é: %fC°", celsius);
	}
}
