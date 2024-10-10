package fundamentos;

import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 1 para converter °C em °F "
				+ "\nDigite 2 para converter °F em °C");
		double op = entrada.nextDouble();
		
		System.out.println("Digite o valor: ");
		double valor = entrada.nextDouble();
		
		double conversao = op == 1 ? (valor * 9/5) + 32 : 0;
		conversao = op == 2 ? (valor - 32) * 5/9 : conversao;
		
		System.out.println(conversao);
		
		entrada.close();
	}
}
