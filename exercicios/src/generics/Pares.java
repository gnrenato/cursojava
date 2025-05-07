package generics;

import java.util.SortedSet;
import java.util.TreeSet;

// 253 - Criando uma Estrutura Chave/Valor com Generics
public class Pares<C extends Number, V> {

	private final SortedSet<Par<C, V>> itens = new TreeSet<>();

	public void adicionar(C chave, V valor) {
		if (chave == null)
			return;

		itens.add(new Par<C, V>(chave, valor));
	}
}
