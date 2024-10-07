package fundamentos.operadores;

public class Ternario {
	// 53 - Operador Ternario
	public static void main(String[] args) {
		
		double media = 4.0;
		String resultadoFinal = media >= 7.0 ? "Aprovado" : "em Recuperação"; // condição ? valor_verdadeiro : valor_falso
		
		System.out.println("O alunno está " + resultadoFinal);
	}
}
