package arrays;

import java.util.Arrays;
import java.util.Scanner;
// 127 - Matriz
public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos Alunos? ");
		int qtdAlunos = entrada.nextInt();

		System.out.println("Quantas notas por aluno? ");
		int qtdNotas = entrada.nextInt();

		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas]; // Matriz

		double total = 0;
		for (int i = 0; i < notasDaTurma.length; i++) { // percorrer a nota
			for (int j = 0; j < notasDaTurma[i].length; j++) { // percorrer o aluno

				System.out.printf("Informa a %d° nota do %d° Aluno ", i + 1, j + 1);
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Media da turma é: " + media);
		
		// Imprimindo os dados da matriz
		for (double[] ds : notasDaTurma) {
			System.out.println(Arrays.toString(ds));
		}

		entrada.close();
	}
}
