package fundamentos;

import java.util.Scanner;

public class ExercicioFahrenheitCelsius {
	
	public static void main(String[] args) {
		// 1 - Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor em °F para conversão em °C: ");
		double fahrenheit = entrada.nextDouble();
		double conversao = (fahrenheit - 32) * 5/9;
		
		System.out.printf("Resultado da conversão é %.2f °C", conversao);
		
		entrada.close();
	}
}
