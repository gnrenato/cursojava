package controle;

import java.util.Iterator;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += '#';
		}
		
		// Desafio - não pode usar valor numero para controlar o laço
		
		for (String i = "#"; !i.equals("######"); i += "#") {
			System.out.println(i);
		}
		
	}
}
