package controle;

public class For1 {
// 71 - FOR 01
	public static void main(String[] args) {
		// utilizamos o FOR para resolver a mesma condição do exercicio WhileDeterminado
		// No caso do FOR criamos a variavel definimos a condição e definimos o contador
		// na passagem de parametro.
		for (int contador = 0; contador <= 20; contador++) {
			System.out.printf("Bom dia! i = %d\n", contador);
		}

		// o FOR não impede que de fazermos os comandos de maneira separada - não
		// utilizar
		int x = 2;
		for (; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}

		// laço infinto
		// for (;;) {
		// }

	}
}
