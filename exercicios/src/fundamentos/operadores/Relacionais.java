package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		// 50 - Operadores Relacionais
		int a = 97;
		int b = 97;
		
		System.out.println(a == b); // Igualdade
		System.out.println(3 > 4);  // MaiorQue
		System.out.println(3 >= 3); // MaiorIgual
		System.out.println(3 < 7);  // MenorQue
		System.out.println(30 <= 7);// MenorIgual
		System.out.println(30 != 7);// Diferente
		
		// Nesse codigo realizamos o uso de operadores logicos e relacionais
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
