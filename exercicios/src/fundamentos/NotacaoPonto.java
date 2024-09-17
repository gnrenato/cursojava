package fundamentos;

public class NotacaoPonto {
	// 27 - Notação Ponto
	// Ela é usada para chamar um metodo caso exista, ela é muito importante na programação java.
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!! ");
		
		System.out.println(s);
		
		String x = "Renato".toLowerCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Re")
				.toUpperCase()
				.concat("!!!!");
		
		System.out.println(y);
		
		// Tipos primitivos não tem a notação "."
	}
}
