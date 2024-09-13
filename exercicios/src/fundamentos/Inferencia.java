package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		//24 - Inferencia de tipos
		double a = 4.2;
		var b = 4.4;
		var c = "Teste";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		double d; // variavel declarada 
		d = 123.65; // variavel inicializada
		System.out.println(d); // variavel usada
		
		//Quando utilizamos o var temos sempre que inicializala na linha var nome = valor;
	}
}
