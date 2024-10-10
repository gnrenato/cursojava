package fundamentos;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		// 3 - Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Calculadora de IMC");
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();
		System.out.print("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.println(imc);
		entrada.close();
	}
}
