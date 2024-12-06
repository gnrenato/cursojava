package arrays;

import java.util.Scanner;

// 125 - Desafio Array - Pegar as notas dos alunos e calcular a media.
public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas que quer informar: ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		double totalNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d° nota: ", i + 1);
			notas[i] = entrada.nextDouble();
			totalNotas += notas[i];
		}
		
		for (double nota : notas) {
			System.out.print(nota + " ");
		}
		System.out.println("");
		System.out.println("Media das notas é: " + totalNotas / qtdNotas);
		
		entrada.close();
	}
}
