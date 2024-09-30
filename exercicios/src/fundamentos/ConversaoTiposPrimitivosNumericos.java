package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		// 34-35 - Conversão de tipos primitivos
		double a = 1; // Conversão implicita porque atribui um valor inteiro ao double.
		System.out.println(a);

		float b = (float) 1.12345698765431; // Conversão explicita(CAST) indicando o tipo que será convertido(houve
											// perda de informação)
		System.out.println(b);

		int c = 4;
		byte d = (byte) c; // explicita (CAST)
		System.out.println(d);

		double e = 1.9999999;
		int f = (int) e; // explicita (cast) com perda de informação
		System.out.println(f);

	}
}
