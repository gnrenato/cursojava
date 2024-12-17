package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

// 136 - Stack (Pilha) LIFO (Last In/ First Out)
public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>(); // instanciando a pilha

		livros.add("As cavernas de aço"); // Caso entre no limite da lista ele retorna um boolean
		livros.push("Fundação"); // Caso entre no limite da lista é retornado uma exceção(erro)
		livros.push("O Hobbit"); // ultimo a entrar na fila
		
		for (String livro : livros) {
			System.out.println(livro);
		}

		System.out.println(livros.peek()); // ultimo a entrar é o primeiro a sair
		System.out.println(livros.element());

		System.out.println(livros.poll()); // remove o ultimo elemento da pilha - retorna um null
		System.out.println(livros.pop()); // remove o ultimo elemento da pilha - retorna uma exeção
		System.out.println(livros.remove()); // remove o ultimo elemento da pilha - retorna uma exeção
		System.out.println(livros.poll());
	}
}
