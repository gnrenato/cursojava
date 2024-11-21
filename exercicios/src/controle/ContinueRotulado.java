package controle;

public class ContinueRotulado {
// 85 - CONTINUE #02 - pode utilizando o continue com um rotulo, como o exemplo abaixo, não é recomendavel.
	public static void main(String[] args) {

		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (i == 1) {
					continue externo;
				}
				System.out.printf("%d %d ", i, j);
			}
			System.out.println();
		}

		System.out.println("Fim!!!");
	}
}
