package controle;

import java.util.Scanner;

public class If {
	// 63 - IF
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		// utilizamos o IF para criar um controle SE (condição) {bloco de codigo a executar}
		if (media <= 10 && media >= 7) {
			System.out.println("Você foi aprovado!");
			System.out.println("Parabens!");
		}
		
		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		// podemos colocar a condição dentro de uma variavel
		boolean calculo = media < 4.5 && media >= 0;
		if (calculo) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}
}
