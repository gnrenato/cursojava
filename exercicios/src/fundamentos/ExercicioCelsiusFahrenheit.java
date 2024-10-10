package fundamentos;

import java.util.Scanner;

public class ExercicioCelsiusFahrenheit {
	
	public static void main(String[] args) {
		// 2 - Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor em °C para conversão em °F: ");
		double celsius = entrada.nextDouble();
		double conversao = (celsius * 9/5) + 32;
		
		System.out.printf("Resultado da conversão é %.2f °F", conversao);
		
		entrada.close();
	}
}
