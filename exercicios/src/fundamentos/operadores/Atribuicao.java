package fundamentos.operadores;

public class Atribuicao {
 // 51 - Operadores de Atribuição
	public static void main(String[] args) {
		
		int a = 3; // Atribuindo um valor literar
		int b = a; // Atribuindo uma variavel
		int c = a + b; // Atribuindo uma operação a variaval
		
		// Outras formas de atribuir
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= 3; // c = c \ 3;
		c %= 2; // c = c % 2;
		
		System.out.println(c);
	}
}
