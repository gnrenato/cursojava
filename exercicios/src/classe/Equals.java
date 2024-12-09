package classe;

//128 - Entendendo Equal e Hashcode
//129 - Equal na pratica
public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@email.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@email.com.br";

		System.out.println(u1 == u2); // comparação o resultado é false
		System.out.println(u1.equals(u2)); // Resultado verdadeiro, utilizando o equals implementado na classe usuario
		System.out.println(u2.equals(u1)); // Resultado verdadeiro, utilizando o equals implementado na classe usuario

		// System.out.println(u2.equals(new Date()));
	}
}
