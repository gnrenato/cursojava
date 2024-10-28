package controle;

import java.util.Scanner;

public class DoWhile {
// 73 - Do/While
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		// essa é a unica expressao que a condição está após o bloco de codigo
		// do não realiza nenhum filtro
		// é executado o bloco de codigo toda a vez
		do {
			System.out.println("Você precisa falar as palavras magicas");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigado");
		entrada.close();
	}
}
