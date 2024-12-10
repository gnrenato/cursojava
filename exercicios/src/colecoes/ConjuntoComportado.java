package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// 132 - Set 02
public class ConjuntoComportado {

	public static void main(String[] args) {

		// utilizando o <> com o tipo <String> pode receber apenas String
		SortedSet<String> lista = new TreeSet<>(); // conjunto set ordenado de acordo com a inserção
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");

		for (String canditado : lista) {
			System.out.println(canditado);
		}
		
		
		Set<Integer> nums = new HashSet<>(); // sem ordem de inserção
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (Integer n : nums) {
			System.out.println(n);
		}

	}
}
