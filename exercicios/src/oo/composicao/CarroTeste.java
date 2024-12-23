package oo.composicao;

//143 - Relacionamento Um pra Um
public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro(); // instaciando o carro 
		
		System.out.println(c1.estaLigado()); // chamando metodos
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		System.out.println(c1.motor.giros());
		
		c1.frear();
		System.out.println(c1.motor.giros());
		
		c1.desligar();
		System.out.println(c1.estaLigado());
		
		// Mostrando a relação biderecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
	}
}
