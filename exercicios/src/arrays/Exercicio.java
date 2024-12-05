package arrays;

import java.util.Arrays;

public class Exercicio {
// 123 Array #2
	public static void main(String[] args) {

		double[] notasAlunoA = new double[3]; // Definindo o array
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		System.out.println(Arrays.toString(notasAlunoA));

		double total = 0;
		// Percorrendo o array utilizando o for
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}

		System.out.println("media " + total / notasAlunoA.length);
		System.out.println(notasAlunoA[0]); // acessando a nota de posição 0
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); // acessando a ultima nota do array
		
		double notaArmazenada = 5.5;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 }; // Definindo o array de um tamanho fixo com os valores literais
														// sendo informados, são menos usados

		System.out.println("Notas Aluno B " + Arrays.toString(notasAlunoB));

		for (int i = 0; i < notasAlunoB.length; i++) {
			total += notasAlunoB[i];
		}

		System.out.println("media Aluno B " + total / notasAlunoB.length);

	}
}
