package controle;

import java.util.Scanner;

public class WhileIndeterminado {
// 72 - While02 - indeterminado
	public static void main(String[] args) {
		
		Scanner entrada = new  Scanner(System.in);
		
		String valor = "";
		
		// o programa vai executar até o usuario digitar sair
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}
}
