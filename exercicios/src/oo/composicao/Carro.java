package oo.composicao;

//143 - Relacionamento Um pra Um
public class Carro {

	final Motor motor; // para manter seguro definimos como uma constante

	Carro() {
		this.motor = new Motor(this);
	}

	void acelerar() {
		if (motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}

	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
