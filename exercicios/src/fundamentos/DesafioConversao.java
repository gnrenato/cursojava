package fundamentos;

import java.util.Scanner;

// 38 - Desafio Conversão
public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu primeiro salario: R$");
		String salario1 = entrada.nextLine().replace(",", ".");

		System.out.println("Digite seu primeiro salario: R$");
		String salario2 = entrada.nextLine().replace(",", ".");

		System.out.println("Digite seu primeiro salario: R$");
		String salario3 = entrada.nextLine().replace(",", ".");

		double num1 = Double.parseDouble(salario1);
		double num2 = Double.parseDouble(salario2);
		double num3 = Double.parseDouble(salario3);

		double media = (num1 + num2 + num3) / 3;

		System.out.println("A média do salario é: R$" + media);

		entrada.close();
	}
}
