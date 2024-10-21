package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	// 68 - Desafio dia da semana -
	// Domingo -> 1 e assim por diante
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o dia da semana: ");
		String dia = entrada.nextLine();

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("Domingo = 1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("Segunda = 2");
		} else if (dia.equalsIgnoreCase("terça") 
				|| dia.equalsIgnoreCase("terca")) {
			System.out.println("Terça = 3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("Quarta = 4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("Quinta = 5");
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("Sexta = 6");
		} else if (dia.equalsIgnoreCase("sabado") 
				|| dia.equalsIgnoreCase("sábado")) {
			System.out.println("Sabado = 5");
		} else {
			System.out.println("Dia invalido");
		}

		entrada.close();
	}
}
