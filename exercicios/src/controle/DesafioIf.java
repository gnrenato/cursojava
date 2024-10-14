package controle;

public class DesafioIf {

	public static void main(String[] args) {
		// 64 - DesafioIF
		double nota = 9.3;
		
		// O problema era que logo após o fechamento do parametro tinha o ; "(nota >= 9.0);" finalizando a linha do
		// codigo e não chegando na sentença 
		if (nota >= 9.0) {
			System.out.println("Quadro de honra");
			System.out.println("Você é fera");
		}
	}
}
