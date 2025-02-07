package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

// 197 Criando Stream - Build Ops
public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print; // referencia de metodo para imprimir
		Consumer<Integer> println = System.out::println; // referencia de metodo para imprimir

		// Criando Streams utilizando .of e passando diretamente os dados
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);

		// Criando Streams utilizando array
		String[] maisLangs = { "Python ", "Lisp ", "Peral ", "Go\n" };
		Stream.of(maisLangs).forEach(print); // Criando Stream a partir do .of
		Arrays.stream(maisLangs).forEach(print); // Criando Stream a partir do array
		Arrays.stream(maisLangs, 1, 4).forEach(print);// Criando Stream indicando uma range dos elemetnos a serem
														// impressos
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print); // Criando Stream a partir de uma lista
		outrasLangs.parallelStream().forEach(print); // Criando um Stream de execução paralela

		// Stream.generate(() -> "a").forEach(print); Para gerar uma Stream de forma
		// infinita sem ordenção
		// Stream.iterate(0, n -> n + 1).forEach(println); gera uma Stream infinita ordenada

	}
}
