package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	// 54 - Igualdade com Strings
	public static void main(String[] args) {
		System.out.println("2" == "2"); // Não é recomendado utilizar o == para comparar 2 strings
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // forma correta de comparação utilizando o .equals
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); // utilizando o .trim para tirar os espaços
		
		entrada.close();
	}
}
