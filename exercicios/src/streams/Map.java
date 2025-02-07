package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

// 199 MAP 2
public class Map {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;

		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda "); // Criando uma List de Strings

		// realizando um build(criamos uma stream) e depois utilizamos o map para
		// transformar a lista em maiusculo e chamei uma terminal ops (forEach)
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);

		// UnaryOperator<String> maiuscula = m -> m.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		// UnaryOperator<String> grito = n -> n + "!!! ";

		System.out.println("\nUsando composição");
		// Utilizamos o map com composição, a função não necessariamente precisa ser
		// declarada sempre que formos usar, podemos definilas em outra classe para
		// reutilizarmos quando necessario.
		marcas.stream().map(Utilitarios.maiuscula).map(primeiraLetra).map(Utilitarios::grito).forEach(print);

	}
}
