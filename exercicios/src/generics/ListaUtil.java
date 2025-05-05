package generics;

import java.util.List;

// 252 - Usando Generics em Metodos
public class ListaUtil {

	public static Object getUltimo1(List<?> lista) { // Estou indicando que com o <?> pode ser uma lista de "qualquer coisa"
		return lista.get(lista.size() - 1);
	}
	
	//Usando Generics
	public static <T> T getUltimo2(List<T> lista){
		return lista.get(lista.size() - 1);
	}
	
	public static <A, B, C> C teste(A paramA, B paramB) { // eu posso ter mais de um parametro generics 
		C teste = null;
		return teste;
	}
}
