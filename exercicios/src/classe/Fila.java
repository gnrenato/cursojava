package classe;

import java.util.LinkedList;
import java.util.Queue;

// 135 - Queue (Fila) FIFO
public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>(); // isntanciando uma fila/criando a fila

		// para adicionar elementos na fila podemos utilizar o metodo add e offer, uma
		// fila pode ter um tamanho definido e quando
		// chegar no ultimo elemento o add retorna um erro e o offer retorna true ou
		// false
		// diferença é o comportamento quando a fila está cheia
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.add("Gui");

		System.out.println(fila.peek()); // Le o elemento da fila mas não remove
		System.out.println(fila.element());// Le o elemento da fila mas não remove
		// a diferença entre os dois é quando a fila está vazia, o peek retorna null e o
		// elemente retorna um erro

//		fila.size(); para saber o tamanho da fila
//		fila.clear(); para limpar a fila
//		fila.isEmpty(); para saber se a fila está vazia

		System.out.println(fila.poll()); // imprimi e remove o elemento da fila, se a fila estiver fazia ele retorna
											// null
		System.out.println(fila.poll());

		System.out.println(fila.remove()); // imprimi e remove o elemento da fila, se a fila estiver fazia ele retorna
											// uma exeção(erro)

	}
}
