package lambdas;

import java.util.Arrays;
import java.util.List;

// 179 Foreach Funcional #01
// 180 Foreach Funcional #02
public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println("Forma Tradicional");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nLambda #01");

		aprovados.forEach(nome -> System.out.println(nome + " !!!!")); // deixa forma consigo personalizar

		System.out.println("\nMethod Reference #1");
		aprovados.forEach(System.out::println); // para cada aprovado imprima na saida do sistema - passando referencia

		System.out.println("\nLambda #02");

		aprovados.forEach(nome -> meuImprimir(nome)); // utilizando o metodo criado
		
		System.out.println("\nMethod Reference #2");
		aprovados.forEach(Foreach::meuImprimir); // para cada aprovado imprima na saida do sistema - passando referencia - utilizando o metodo

	}

// metodo criado para utilizar na referencia e lambda
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
