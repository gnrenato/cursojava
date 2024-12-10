package colecoes;

import java.util.HashSet;
import java.util.Set;

// 131 - Set 01
public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		// Array não aceita tipos primitivos, ele converte automaticamente para um obj
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Bollean
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("Tamanho: " + conjunto.size()); // tamanho do conjunto

		// repetição dos dados não alteram o tamanho
		conjunto.add("Teste");
		System.out.println("Tamanho: " + conjunto.size());

		// Remover elemento
		System.out.println(conjunto.remove("teste")); // retorna false
		System.out.println(conjunto.remove("Teste")); // remove - retorna true
		System.out.println("Tamanho: " + conjunto.size()); // tamanho depois de remover

		// Verificar se contem o dado dentro do conjunto
		System.out.println(conjunto.contains("Teste")); // retorna falso pois removi o dado
		System.out.println(conjunto.contains('x')); // retorna true pois existe o dado

		// utilizando o set
		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums); // apresenta os dados do conjunto
		System.out.println(conjunto); // apresenta os dados do conjunto

		// conjunto.addAll(nums); // adicionou todos os dados de nums no conjunto -
		// União entre dois conjuntos
		conjunto.retainAll(nums); // Retem somente o que existe nos dois conjunto
		System.out.println(conjunto); // apresenta os dados do conjunto

		conjunto.clear(); // Limpa os dados do conjunto
		System.out.println(conjunto);
	}
}
