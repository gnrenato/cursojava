package fundamentos.operadores;

public class DesafioAritmeticos {
	// 44 - Desafio Operadores Aritmeticos
	public static void main(String[] args) {
		
		double a1 = Math.pow(6 * (3 + 2), 2);
		double b1 = a1 / (3*2);
		
		double a2 = Math.pow((( 1 - 5 ) * ( 2 - 7 )) / 2, 2);
		
		double resultado = Math.pow(b1 - a2, 3) / Math.pow(10, 3);
		
		System.out.println(resultado);
	}
}
