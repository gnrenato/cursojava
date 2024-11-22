package controle;

import java.util.Scanner;

public class Exercicio1 {
	// 1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero entre 0 e 10: ");
		int numero = entrada.nextInt();
		
		if (numero >= 0 && numero <=10) {
			if (numero % 2 == 0) {
				System.out.printf("Numero %d é par", numero);
			} else {
				System.out.printf("Numero %d é impar", numero);
			}
		} else {
			System.out.println("Numero Invalido");
		}
		
		entrada.close();
	}
}
