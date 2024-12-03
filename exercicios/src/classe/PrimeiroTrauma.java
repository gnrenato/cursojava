package classe;

// 112 - Desafio Primeiro Trauma - mostrar o valor da varivel a sem alterar a linha. 
public class PrimeiroTrauma {

	int a = 3;
	static int b = 4; // podemos tambem transformar esse atributo em static possibilitando o acesso do
						// metodo que tambem é estatico (static)

	public static void main(String[] args) {
		// temos que instaciar um objeto para acessar o atributo a.
		PrimeiroTrauma a1 = new PrimeiroTrauma();
		System.out.println(a1.a);

		System.out.println(b);
	}
}
