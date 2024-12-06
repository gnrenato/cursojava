package arrays;

// 124 - ForEach - é uma estrutura de controle utilizada para percorrer um array ou colletions e mostrar seu valor, 
// pode ser um substitudo para o laço for caso dentro das suas limitações. 
public class Foreach {

	public static void main(String[] args) {

		double[] notas = { 9.9, 8.7, 7.2, 9.4 };

		// for
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

		// foreach
		for (double nota : notas) {
			System.out.println(nota);
		}
	}
}
