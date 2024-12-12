package colecoes;

import java.util.ArrayList;
import java.util.List;

// 133 - List
public class Lista {

	public static void main(String[] args) {

		List<Usuario> lista = new ArrayList<Usuario>(); // Criação de uma nova lista

		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Renato"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));

		System.out.println(lista.get(3)); // Acessado pelo indice
		
		lista.remove(1); // removendo via indece
		lista.remove(new Usuario("Manu")); // removendo via objeto
		
		System.out.println(lista.contains(new Usuario("Lia"))); // verificando se contem a informação na lista

		for (Usuario usuario : lista) {
			System.out.println(usuario); // acessando utilizando o metodo toString
		}
	}
}
