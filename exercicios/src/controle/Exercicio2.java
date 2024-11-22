package controle;

import java.time.LocalDate;

public class Exercicio2 {
	// 2. Criar um programa informa se o ano atual é um ano bissexto;
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		int anoAtual = hoje.getYear();
		anoAtual = 2028; 
		
		if (anoAtual % 4 == 0 || anoAtual % 400 == 0 && anoAtual % 100 != 0) {
			System.out.printf("%d Ano Bissexto", anoAtual);
		} else {
			System.out.printf("%d Ano não Bissexto", anoAtual);
		}
		System.out.println();
		System.out.println(anoAtual);
	}
}
