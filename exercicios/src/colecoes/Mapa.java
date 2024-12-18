package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// 137 - MAP
public class Mapa {

	public static void main(String[] args) {

		// Podemos percorrer o Map utilizando a chave ou o valor
		Map<Integer, String> usuarios = new HashMap<Integer, String>(); // instaciando um Map, que utiliza chave e
																		// valor.

		usuarios.put(1, "Renato"); // para adicionar dados no map utilizando o .put ele é utilizando tanto para
									// incluir como para alterar
		usuarios.put(1, "Amanda"); // alterei o dado Renato para Amanda da chave 1
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Luana");

		System.out.println(usuarios.size()); // retorna o tamano do map

		System.out.println(usuarios.isEmpty()); // Verifica se está vazio

		System.out.println(usuarios.keySet()); // retorna as chaves

		System.out.println(usuarios.values()); // retorna os valores

		System.out.println(usuarios.entrySet()); // retorna as chaves e valores

		System.out.println(usuarios.containsKey(2)); // retorna se existe a chave indicada no ()

		System.out.println(usuarios.containsValue("Amanda")); // retorna se existe o valor indicado no ()

		System.out.println(usuarios.get(3)); // retorna o valor da chave indicada no ()

		System.out.println(usuarios.remove(3)); // remove os dados da chave indicada ()

		System.out.println(usuarios.remove(2, "Valor")); // remove os dados se existe a chave e valor

		// listar as chaves
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		// listas os valores
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}

		// listar chave e valores
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}

	}
}
