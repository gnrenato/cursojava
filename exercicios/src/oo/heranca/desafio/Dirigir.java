package oo.heranca.desafio;

public class Dirigir {

	public static void main(String[] args) {

		Carro civic = new Civic();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();

		Carro ferrari = new Ferrari();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();

		System.out.println("Civic " + civic);
		System.out.println("Ferrari " + ferrari);
		
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		ferrari.frear();
		
		System.out.println("Civic " + civic);
		System.out.println("Ferrari " + ferrari);
	}
}
