package classe;

//105 106 Membros de Classe vs Instância #01#02
public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc a = new AreaCirc(5.6); // Instacia da classe utilizando o contrutor e passando o valor do raio via
										// parametro

		System.out.println(a.area()); // utilizando o objeto instaciado para acessar o metodo de calculo da
										// circunferencia.
		System.out.println(AreaCirc.area(100)); // utilizando o metodo estatico para realizar o calculo da
												// circunferencia.

		System.out.println(AreaCirc.PI); // imprimindo o valor do PI - membro da classe.
	}
}
