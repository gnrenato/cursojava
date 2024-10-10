package fundamentos;

import java.util.Scanner;

public class CalculoAreaTriangulo {
	// 5 - Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor da base do Triangulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura do Triangulo: ");
		double altura = entrada.nextDouble();
		
		double areaTriangulo = (base * altura) / 2;
		
		System.out.printf("A area do triangulo é: %.2f", areaTriangulo);
		
		entrada.close();
	}
}
