package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

// 205 Desafio filter 1  
public class DesafioFilter {

	public static void main(String[] args) {

		LinguagensPrgramacao l1 = new LinguagensPrgramacao(1, "JavaScript");
		LinguagensPrgramacao l2 = new LinguagensPrgramacao(2, "Python");
		LinguagensPrgramacao l3 = new LinguagensPrgramacao(3, "Java");
		LinguagensPrgramacao l4 = new LinguagensPrgramacao(4, "C#");
		LinguagensPrgramacao l5 = new LinguagensPrgramacao(5, "TypeScript");

		List<LinguagensPrgramacao> linguagens = Arrays.asList(l1, l2, l3, l4, l5);

		Predicate<LinguagensPrgramacao> posicao = l -> l.posicao <= 3;
		Predicate<LinguagensPrgramacao> nomeJ = l -> l.nome.startsWith("J");
		Function<LinguagensPrgramacao, String> linguagensNome = l -> "As linguagens mais usadas com a letra J são: "
				+ l.posicao + " " + l.nome;

		linguagens.stream().filter(posicao).filter(nomeJ).map(linguagensNome).forEach(System.out::println);
	}
}
