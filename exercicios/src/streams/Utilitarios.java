package streams;

import java.util.function.UnaryOperator;

// 199 MAP 2
public class Utilitarios {

	private Utilitarios() {
	}

	public final static UnaryOperator<String> maiuscula = m -> m.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

	public final static String grito(String n) {
		return n + "!!! ";
	}
}
