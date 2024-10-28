package controle;

import java.util.Scanner;

public class DesafioWhile {
// 74 - Desagio While
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		// variaveis
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		System.out.println("Digite uma nota valida: ");
		
		while (nota != -1) { // se a nota for diferente de -1 execute o codigo
			System.out.print("Informe a nota ou -1 para sair: ");
			nota = entrada.nextDouble(); // pegue o valor digitado

			if (nota <= 10 && nota >= 0) { // controle de notas validas
				total += nota; // soma das notas do total
				quantidadeDeNotas++; // contador de quantidade de notas
			} else if (nota != -1) {
				System.out.println("Nota Invalida");
			}
		}

		// Calcular Media
		double media = total / quantidadeDeNotas;
		System.out.printf("Media = %.2f", media);

		entrada.close();
	}
}
