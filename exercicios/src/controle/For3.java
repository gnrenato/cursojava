package controle;

public class For3 {
// 77 - For #03 - Fizemos um laço For dentro do outro. Se atentar no Escopo da variavel. 
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]\n", i, j);
			}
		}
	}
}
