package fundamentos;

import java.util.Scanner;

public class CalculoValorQuadradoCubo {

	public static void main(String[] args) {
		// 4 - Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor que quer calcular o quadrado e o cubo: ");
		double valor = entrada.nextDouble();
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.printf("O valor %.2f² é %.2f e o valor %.2f³ é %.2f", valor, quadrado, valor, cubo);
		
		entrada.close();
	}
}
