package controle;

import java.util.Scanner;

public class Exercicio5 {
	// 5. Refatorar o exercício 04, utilizando a estrutura switch.
	public static void main(String[] args) {
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  não é um numero primo.");

		}
		entrada.close();
	}

}
