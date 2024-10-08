package fundamentos.operadores;

public class Unarios {
	// 52 Operadores Unarios
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		// Forma pos fixada
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		// Forma pre fixada
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio");
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
